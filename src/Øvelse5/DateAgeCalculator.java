package Øvelse5;

public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;

        int lowest = yourAge / 2 + 7;

        if (lowest > dateAge) {
            System.out.println("Din date er for ung!");
        } else {
            System.out.println("Din date passer fint med din alder");
        }
    }
}
