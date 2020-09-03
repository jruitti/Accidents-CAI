package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.CommonConditionEntity;
import ar.edu.undec.accidents.mongoadapter.persistence.mapper.CommonConditionDataMapper;
import model.CommonCondition;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;
import repository.IMostCommonConditionsRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;


@Service
public class MostCommonConditionRepoImplementation implements IMostCommonConditionsRepository {

    private final MongoTemplate mongoTemplate;

    public MostCommonConditionRepoImplementation(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Collection<CommonCondition> queryMostCommonConditions() {
        MatchOperation matchOperation= match(new Criteria("Wind_Direction").ne(null).and("Civil_Twilight").ne(null));
        GroupOperation groupOperation = group("Civil_Twilight","Wind_Direction").count().as("conteo");
        SortOperation sortOperation = sort(Sort.Direction.DESC, "conteo");
        Aggregation aggregation = newAggregation(matchOperation,groupOperation,sortOperation);
        AggregationResults<CommonConditionEntity> result = mongoTemplate.aggregate(aggregation,"accidentes",CommonConditionEntity.class);
        return result.getMappedResults().stream().map(CommonConditionDataMapper::dataCoreMapper).collect(Collectors.toCollection(ArrayList::new));
    }
}
