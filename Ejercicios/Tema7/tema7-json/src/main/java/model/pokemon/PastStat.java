package model.pokemon;

@lombok.Data
public class PastStat {
    private Species generation;
    private Stat[] stats;
}
