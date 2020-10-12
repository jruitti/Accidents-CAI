package ar.edu.undec.elasticadapter.persistence.crud;

import ar.edu.undec.elasticadapter.persistence.datamodel.AccidentEntity;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface IAccidentsInRadiusCRUD extends ElasticsearchRepository<AccidentEntity,String> {

    @Query( "{\"bool\":{\"must\":{\"match_all\":{}},\"filter\":{\"geo_distance\":{\"distance\":\"?1km\",\"start_location\":\"?0\"}}}}")
    Stream<AccidentEntity> findInRadius(String coordinates, float radius);
}
