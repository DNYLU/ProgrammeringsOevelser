package Øvelse7;

public class BMI {
    private double height;
    private double weight;

    public double bmiCalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;

        double bmi = weight / (height * height);

        System.out.println("Din bmi er: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Du er undervægtig");
        } else if (bmi > 25) {
            System.out.println("Du er overvægtig");
        } else {
            System.out.println("Din vægt passer med din højde");
        }

        return bmi;
    }


}
