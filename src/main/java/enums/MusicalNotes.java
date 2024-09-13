package enums;

public enum MusicalNotes {
    C(261.63),
    D(293.66),
    E(329.63),
    F(349.23),
    G(392.00),
    A(440.00),
    B(493.88);

    private final double frequency; // In Hertz

    MusicalNotes(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }
}
