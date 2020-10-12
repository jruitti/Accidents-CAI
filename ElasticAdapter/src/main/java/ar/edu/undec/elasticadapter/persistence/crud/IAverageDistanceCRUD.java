package ar.edu.undec.elasticadapter.persistence.crud;

import ar.edu.undec.elasticadapter.persistence.datamodel.AccidentEntity;


import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface IAverageDistanceCRUD extends ElasticsearchRepository<AccidentEntity, String> {


    @Query( "{\"bool\":{\"must\":{\"exists\":{\"field\":\"End_Lat\"}}}}")
    Stream<AccidentEntity> getEndLatNotNull();
}
