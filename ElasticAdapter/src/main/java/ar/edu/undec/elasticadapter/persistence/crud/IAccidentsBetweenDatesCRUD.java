package ar.edu.undec.elasticadapter.persistence.crud;

import ar.edu.undec.elasticadapter.persistence.datamodel.AccidentEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface IAccidentsBetweenDatesCRUD extends ElasticsearchRepository<AccidentEntity,String> {

    List<AccidentEntity> findByStartTimeBetween(LocalDateTime fromDate, LocalDateTime toDate);

}
