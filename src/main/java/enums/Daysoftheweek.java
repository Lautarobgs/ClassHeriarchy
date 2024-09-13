package enums;

public enum Daysoftheweek {
    MONDAY("Start of the work week"),
    TUESDAY("Second workday"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost the weekend"),
    FRIDAY("End of the work week"),
    SATURDAY("Day of rest"),
    SUNDAY("Day of relaxation");

    private final String description;

    Daysoftheweek(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
