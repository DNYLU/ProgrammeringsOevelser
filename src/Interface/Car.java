package Interface;

public class Car implements Comparable {
    String name;

    public Car(String name) {
        this.name = name;
    }

    public int compareTo(Object o) { //Laves fordi, at comparable har denne metode.
        if (o instanceof Car) { //Tjekker om objektet o er en car
            if (this.name == ((Car) o).name) { //Skriv o.name
                return 0; // 0 hvis det er det samme
            }
        } else {
            return 1; // 1 hvis den er større en den anden og -1 hvis den er mindre
        }
        return 1;
    }
}
