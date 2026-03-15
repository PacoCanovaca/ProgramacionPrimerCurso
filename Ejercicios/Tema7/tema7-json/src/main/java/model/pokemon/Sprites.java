package model.pokemon;

@lombok.Data
public class Sprites {
    private String backDefault;
    private String backFemale;
    private String backShiny;
    private String backShinyFemale;
    private String frontDefault;
    private String frontFemale;
    private String frontShiny;
    private String frontShinyFemale;
    private Other other;
    private Versions versions;
    private Sprites animated;
}
