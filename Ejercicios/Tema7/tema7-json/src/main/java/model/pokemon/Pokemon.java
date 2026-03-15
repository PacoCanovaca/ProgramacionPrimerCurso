package model.pokemon;

@lombok.Data
public class Pokemon {
    private Ability[] abilities;
    private long baseExperience;
    private Cries cries;
    private Species[] forms;
    private GameIndex[] gameIndices;
    private long height;
    private HeldItem[] heldItems;
    private long id;
    private boolean isDefault;
    private String locationAreaEncounters;
    private Move[] moves;
    private String name;
    private long order;
    private PastAbility[] pastAbilities;
    private PastStat[] pastStats;
    private Object[] pastTypes;
    private Species species;
    private Sprites sprites;
    private Stat[] stats;
    private Type[] types;
    private long weight;

    public void mostrarDatos() {
        System.out.println("Nombre = " + name);
        System.out.println("Altura = " + height + "cm");
        System.out.println("Peso = " + weight + "kg");
        System.out.println("Hp = " + stats[0].getBaseStat());
        System.out.println("Ataque = " + stats[1].getBaseStat());
        System.out.println("Defensa = " + stats[0].getBaseStat());
    }

}
