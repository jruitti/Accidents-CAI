package ar.edu.undec.elasticadapter.persistence.repoimplementation;

import ar.edu.undec.elasticadapter.config.ElasticIndexName;
import ar.edu.undec.elasticadapter.persistence.datamodel.AccidentEntity;
import model.CommonCondition;
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

@Repository
public class CommonConditionRepoImplementation implements IMostCommonConditionsRepository {

    private ElasticsearchOperations elasticsearchOperations;

    public CommonConditionRepoImplementation(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }

    @Override
    public Collection<CommonCondition> queryMostCommonConditions() {
        final TermsAggregationBuilder wind = AggregationBuilders.terms("wind").field("Wind_Direction.keyword").size(100);
        final TermsAggregationBuilder civil = AggregationBuilders.terms("civil").field("Civil_Twilight.keyword").subAggregation(wind).size(100);
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .addAggregation(civil)
                .build();

        SearchHits<AccidentEntity> searchHits = elasticsearchOperations.search(searchQuery, AccidentEntity.class, IndexCoordinates.of(ElasticIndexName.indexName));

        final ParsedStringTerms bucketCivil = (ParsedStringTerms) searchHits.getAggregations().asMap().get("civil");

        List<CommonCondition> commonConditionList = new ArrayList<>();
        bucketCivil.getBuckets().forEach(aCivilBucket -> {
            ParsedStringTerms bucketWind = (ParsedStringTerms) aCivilBucket.getAggregations().asMap().get("wind");
            bucketWind.getBuckets().forEach(aWindBucket -> {
                Map<String, Object> idCommonCondition = new HashMap<>();
                idCommonCondition.put(aCivilBucket.getKeyAsString(), aWindBucket.getKeyAsString());
                commonConditionList.add(CommonCondition.factory(idCommonCondition, (int) aWindBucket.getDocCount()));
            });
        });
        return commonConditionList;
    }
}
