package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.DangerousPointEntity;
import model.DangerousPoint;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
import repository.IDangerousPointRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

@Service
public class DangerousPointRepoImplementation implements IDangerousPointRepository {


    private final MongoTemplate mongoTemplate;

    public DangerousPointRepoImplementation(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Collection<DangerousPoint> getDangerousPoints(float radiusInKm) {

        StopWatch watch = new StopWatch();
        watch.start("getAll");
        //List<DangerousPointEntity> result = mongoTemplate.find(new Query(), DangerousPointEntity.class);
        watch.stop();
        System.out.println(watch.getTotalTimeSeconds());
        watch.start("retrieve");
        List<DangerousPoint> dangerousPointsList=new ArrayList<>();
//        List<DangerousPoint> dangerousPointsList = result.parallelStream().map(accident -> {
//            BasicQuery basicQuery = new BasicQuery("{start_location: { $geoWithin: { $centerSphere: [ [" + accident.getStartLocation().getX() + "," + accident.getStartLocation().getY() + "], " + Math.round (radiusInKm / 6371) + "] }}})");
//            List<DangerousPointEntity> accidentsInRadius = mongoTemplate.find(basicQuery, DangerousPointEntity.class);
//            return DangerousPoint.factory((float) accident.getStartLocation().getX(), (float) accident.getStartLocation().getY(), accidentsInRadius.size());
//        }).collect(Collectors.toCollection(ArrayList::new));

        BasicQuery otraQuery=new BasicQuery("{},{start_location:1, Start_Lat:1, Start_Lng:1})\n" +
                "    .limit(100)\n" +
                "    .map(\n" +
                "    function(danger){\n" +
                "        var inradius=db.accidentes.aggregate([{\n" +
                "            $match: {\n" +
                "                \"start_location\": {\n" +
                "                    $geoWithin: { \n" +
                "                        $centerSphere: [ [ danger.Start_Lng,danger.Start_Lat], 1/6371 ]\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "          $count: \"count\"\n" +
                "        }])\n" +
                "        var retorno={\n" +
                "            \"longitude\":danger.Start_Lng,\n" +
                "            \"latitude\":danger.Start_Lat,\n" +
                "            \"amount\":inradius._batch[0].count\n" +
                "        }\n" +
                "        return retorno;//print(danger.start_location.coordinates+\" -->\"+temp);\n" +
                "    })");
        List<DangerousPointEntity> accidentsInRadius = mongoTemplate.find(otraQuery, DangerousPointEntity.class);
        watch.stop();
        watch.start("sort");
        dangerousPointsList.sort(Comparator.comparing(DangerousPoint::getAmount).reversed());
        watch.stop();
        System.out.println(watch.prettyPrint());
        return dangerousPointsList;
    }
}
