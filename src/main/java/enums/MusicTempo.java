package enums;

public enum MusicTempo {
    LARGO("Very slow", 40, 60),
    ADAGIO("Slow and stately", 66, 76),
    ANDANTE("Walking pace", 76, 108),
    ALLEGRO("Fast and lively", 120, 168),
    PRESTO("Very fast", 168, 200);

    private final String description;
    private final int minBpm;
    private final int maxBpm;

    MusicTempo(String description, int minBpm, int maxBpm) {
        this.description = description;
        this.minBpm = minBpm;
        this.maxBpm = maxBpm;
    }

    public String getDescription() {
        return description;
    }

    public int getMinBpm() {
        return minBpm;
    }

    public int getMaxBpm() {
        return maxBpm;
    }
}
