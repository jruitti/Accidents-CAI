package ar.edu.undec.elasticadapter.persistence.repoimplementation;

import ar.edu.undec.elasticadapter.persistence.crud.IAccidentsInRadiusCRUD;
import ar.edu.undec.elasticadapter.persistence.crud.IDangerousPointCRUD;
import model.DangerousPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Repository;
import repository.IDangerousPointRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class DangerousPointRepoImplementation implements IDangerousPointRepository {

    @Autowired
    IDangerousPointCRUD dangerousPointCRUD;

    @Autowired
    IAccidentsInRadiusCRUD accidentsInRadiusCRUD;

    private ElasticsearchOperations elasticsearchOperations;

    public DangerousPointRepoImplementation(ElasticsearchOperations elasticsearchOperations1) {
        this.elasticsearchOperations = elasticsearchOperations1;
    }


    @Override
    public Collection<DangerousPoint> getDangerousPoints(float radiusInKm) {
        List<DangerousPoint> dangerousPointCollection = dangerousPointCRUD.findTop10000By().map(acc -> {
            float count = (int) accidentsInRadiusCRUD.findInRadius(acc.getStartLocation(), radiusInKm).count();
            return DangerousPoint.factory(acc.getStartLng(), acc.getStartLat(), (int)count);
        }).collect(Collectors.toCollection(ArrayList::new));

        dangerousPointCollection.sort(Comparator.comparing(DangerousPoint::getAmount).reversed());
        System.out.println(dangerousPointCollection.get(0));
        return dangerousPointCollection;

    }
}
