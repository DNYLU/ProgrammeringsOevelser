package Repetitionsopgaver;
import java.util.Scanner;

public class Menuvalg {

    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Beregn");
        System.out.println("2. Udskriv");
        System.out.println("3. Hjælp");
        System.out.print("Indtast valg: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Du valgte beregn");
                break;
            case 2:
                System.out.println("Du valgte udskriv");
                break;
            case 3:
                System.out.println("Du valgte hjælp");
        }
        if (choice > 3) {
            System.out.println("Indtast venligst et tal fra menuen");
            menu();
        }

    }

}
