package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.AccidentEntity;
import model.DangerousPoint;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
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
    public Collection<DangerousPoint> getDangerousPoints(){
        List<AccidentEntity> result= mongoTemplate.find(new Query().limit(5), AccidentEntity.class);
        List<DangerousPoint> aPoints=new ArrayList<>();

        for (AccidentEntity theAccident : result) {
            BasicQuery basicQuery = new BasicQuery("{start_location: { $geoWithin: { $centerSphere: [ [" + theAccident.getStartLocation().getX() + "," + theAccident.getStartLocation().getY() + "], " + 1 / 6371 + "] }}})");
            List<AccidentEntity> resultado = mongoTemplate.find(basicQuery, AccidentEntity.class);
            aPoints.add(DangerousPoint.factory((float)theAccident.getStartLocation().getX(),(float)theAccident.getStartLocation().getY(),resultado.size()));
        }

        System.out.println(aPoints);
        aPoints.sort(Comparator.comparing(DangerousPoint::getAmount).reversed());
        return aPoints;

    }
}
