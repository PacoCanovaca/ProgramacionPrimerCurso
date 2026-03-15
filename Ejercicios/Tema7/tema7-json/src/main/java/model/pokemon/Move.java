package model.pokemon;

@lombok.Data
public class Move {
    private Species move;
    private VersionGroupDetail[] versionGroupDetails;
}
