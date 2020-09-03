package model;

import java.util.Map;

public class CommonCondition {
    private Map<String, Object> civilTwilight;
    private Integer conteo;

    public CommonCondition(Map<String, Object> civilTwilight, Integer conteo) {
        this.civilTwilight = civilTwilight;
        this.conteo = conteo;
    }

    public static CommonCondition factory(Map<String, Object> civilTwilight, Integer conteo) {
        return new CommonCondition(civilTwilight, conteo);
    }
}
