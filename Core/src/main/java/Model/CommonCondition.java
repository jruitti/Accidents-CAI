package model;

public class CommonCondition {

    private String id;
    private String civilTwilight;
    private String weatherCondition;
    private String precipitation;

    public CommonCondition(String civilTwilight, String weatherCondition, String precipitation) {
        this.civilTwilight = civilTwilight;
        this.weatherCondition = weatherCondition;
        this.precipitation = precipitation;
    }

    public static CommonCondition factory(String civilTwilight, String weatherCondition, String precipitation) {

        return new CommonCondition(civilTwilight,weatherCondition,precipitation);
    }
}
