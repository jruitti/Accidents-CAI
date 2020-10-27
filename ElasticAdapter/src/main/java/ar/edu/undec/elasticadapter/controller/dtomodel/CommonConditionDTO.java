package ar.edu.undec.elasticadapter.controller.dtomodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class CommonConditionDTO {


    @JsonProperty("Civil_Twilight")
    private Map<String, Object> Civil_Twilight;
    @JsonProperty("conteo")
    private Integer conteo;

    public CommonConditionDTO(@JsonProperty("Civil_Twilight") Map<String, Object> Civil_Twilight,
                              @JsonProperty("conteo") Integer conteo) {
        this.Civil_Twilight = Civil_Twilight;
        this.conteo = conteo;
    }
}
