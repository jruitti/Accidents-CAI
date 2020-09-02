package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.persistence.crud.IMostCommonConditionsCRUD;
import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.CommonConditionEntity;
import model.CommonCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.stereotype.Service;
import repository.IMostCommonConditionsRepository;

import java.util.Collection;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;


@Service
public class MostCommonConditionRepoImplementation implements IMostCommonConditionsRepository {


    @Override
    public Collection<CommonCondition> queryMostCommonConditions() {
        GroupOperation groupByStateAndSumPop = group("Civil_Twilight")
                .count().as("conteo");

        Aggregation aggregation = newAggregation(
                groupByStateAndSumPop);
        AggregationResults<CommonConditionEntity> result = mongoTemplate


    }

//    "$Civil_Twilight"},
//        cuenta: {$sum:1}
//        }
//        }])
//
//        visi: "$Visibility(mi)",
//        humi: "$Humidity(%)",
//        winspd: "$Wind_Speed(mph)",
//        windir: "$Wind_Direction",
//        weacond: "$Weather_Condition",
//
//        "Temperature(F)"
//        "Humidity(%)"
//        "Pressure(in)"
//        "Visibility(mi)"
}
