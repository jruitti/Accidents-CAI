package ar.edu.undec.accidents.mongoadapter.persistence.datamodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "accidentes")
public class CommonConditionEntity {

    @Id
    private Map<String, Object> Civil_Twilight;
    private Integer conteo;

    public Map<String, Object> getCivil_Twilight() {
        return Civil_Twilight;
    }

    public Integer getConteo() {
        return conteo;
    }

}
