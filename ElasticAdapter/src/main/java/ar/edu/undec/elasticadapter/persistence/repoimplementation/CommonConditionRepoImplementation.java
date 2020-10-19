package ar.edu.undec.elasticadapter.persistence.repoimplementation;

import ar.edu.undec.elasticadapter.persistence.datamodel.AccidentEntity;
import model.CommonCondition;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.ParsedStringTerms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Repository;
import repository.IMostCommonConditionsRepository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class CommonConditionRepoImplementation implements IMostCommonConditionsRepository {

    private ElasticsearchOperations elasticsearchOperations;

    public CommonConditionRepoImplementation(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }


    @Override
    public Collection<CommonCondition> queryMostCommonConditions() {
        final TermsAggregationBuilder wind = AggregationBuilders.terms("wind").field("Wind_Direction.keyword");
        final TermsAggregationBuilder civil = AggregationBuilders.terms("civil").field("Civil_Twilight.keyword").subAggregation(wind);
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .addAggregation(civil)
                .build();

        SearchHits<AccidentEntity> searchHits = elasticsearchOperations.search(searchQuery, AccidentEntity.class, IndexCoordinates.of("dbofaccidents"));

        final ParsedStringTerms bucketCivil = (ParsedStringTerms) searchHits.getAggregations().asMap().get("civil");

        final List<CommonCondition> commonConditionList = bucketCivil.getBuckets()
                .stream()
                .map(bucket -> {
                    Map<String, Object> idCommonCondition=new HashMap<>();
                    idCommonCondition.put(bucket.getKeyAsString(),bucket.getKeyAsString());
                    return CommonCondition.factory(idCommonCondition,(int)bucket.getDocCount());
                })
                .collect(Collectors.toCollection(ArrayList::new));

        return commonConditionList;
    }
}
