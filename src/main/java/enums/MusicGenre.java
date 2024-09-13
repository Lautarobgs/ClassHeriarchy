package enums;

public enum MusicGenre {
    ROCK("Fast and energetic"),
    JAZZ("Improvisation and swing"),
    CLASSICAL("Complex and harmonious structure"),
    ELECTRONIC("Synthesized sounds"),
    METAL("Distorted and heavy rhythm");

    private final String description;

    MusicGenre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
