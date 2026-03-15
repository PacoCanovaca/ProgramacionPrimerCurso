package model.pokemon;

@lombok.Data
public class HeldItem {
    private Species item;
    private VersionDetail[] versionDetails;
}
