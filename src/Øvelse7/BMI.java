package Øvelse7;

public class BMI {
    private double height;
    private double weight;

    public BMI (double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double calculateBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    public boolean isUnderWeight() {
        return this.calculateBMI() < 18.5;
    }

    public boolean isOverWeight() {
        return this.calculateBMI() > 25;
    }

    public boolean isNormalWeight() {
        return this.calculateBMI() > 18.5 && this.calculateBMI() < 25;
    }

 /*System.out.println("Din bmi er: " + bmi);
        if (bmi < 18.5) {
        System.out.println("Du er undervægtig");
    } else if (bmi > 25) {
        System.out.println("Du er overvægtig");
    } else {
        System.out.println("Din vægt passer med din højde");
    } */
}
