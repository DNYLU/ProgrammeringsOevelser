package Interface;

import java.util.ArrayList;

public class MainCar {
    public static void main(String[] args) {
        Comparable car1 = new Car("McQueen"); //Vi bruger metoden fra comparable
        Comparable car2 = new Car("Volvo");
        Comparable car3 = new Car("McQueen");
        Car car4 = new Car("Mercedes");

        System.out.println(car1.compareTo(car2)); //1 fordi at det ikke er de samme
        System.out.println(car3.compareTo(car1));// 0 fordi at de er det samme
    }
}
