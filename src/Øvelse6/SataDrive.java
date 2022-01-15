package Øvelse6;

public class SataDrive {
    private String name;
    private boolean available;

    public SataDrive(String name, boolean available) {
        this.name = name;
        this.available = available;
    }

    //toString for at give besked på, om der er en ledig plads,
    // og så vi ikke får positionen udskrevet
    public String toString() {
        if (available == false) {
            return this.name + " is unavailable";
        } else {
            return this.name + " is available";
        }
    }
}
