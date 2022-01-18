package Øvelse7;

public class Main7 {
    public static void main(String[] args) {
        BMI bmi = new BMI(1.72, 60);
        bmi.calculateBMI();

        System.out.println("Din BMI er: " + bmi.calculateBMI());

        System.out.println(bmi.isUnderWeight());
        System.out.println(bmi.isOverWeight());
        System.out.println(bmi.isNormalWeight());



    }
}
