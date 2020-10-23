package ar.edu.undec.elasticadapter.persistence.crud;

import ar.edu.undec.elasticadapter.persistence.datamodel.DangerousPointEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface IDangerousPointCRUD extends ElasticsearchRepository<DangerousPointEntity, String> {

    Stream<DangerousPointEntity> findTop10000By();

    Stream<DangerousPointEntity> findDistinctBy();


}
