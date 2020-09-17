package ar.edu.undec.accidents.mongoadapter.persistence.datamodel;

import org.springframework.data.annotation.Id;

import java.util.Map;

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
