package enums;

public enum Instrument {
    GUITAR("Strings", "Standard E tuning"),
    PIANO("Keyboard", "Standard tuning"),
    DRUMS("Percussion", "No exact tuning"),
    VIOLIN("Strings", "G tuning"),
    TRUMPET("Wind", "B flat tuning");

    private final String type;
    private final String tuning;

    Instrument(String type, String tuning) {
        this.type = type;
        this.tuning = tuning;
    }

    public String getType() {
        return type;
    }

    public String getTuning() {
        return tuning;
    }
}
