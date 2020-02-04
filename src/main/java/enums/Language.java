package enums;

public enum Language {
    ENGLISH("en"),
    GERMAN("de"),
    RUSSIAN("ru"),
    ITALIAN("it"),
    PORTUGESE("pt"),
    JAPANESE("ja"),
    SPANISH("es"),
    FRENCH("fr"),
    CHINESE("zh"),
    POLISH("pl");

    private String value;

    Language(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }
}
