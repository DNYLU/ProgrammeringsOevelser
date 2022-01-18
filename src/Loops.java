import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        new Loops().doWhile();
        new Loops().whileLoop();
        new Loops().forLoop();
        new Loops().forEach();
    }


    public void doWhile() {
        String input;
        do {
            Scanner playerInput = new Scanner(System.in);
            input = playerInput.nextLine();
        } while (!input.equalsIgnoreCase("Yo"));
        System.out.println("Nice");
    }

    public void whileLoop() {
        Scanner playerInput = new Scanner(System.in);
        while (!playerInput.hasNextInt()) {
            System.out.println("Forkert");
            playerInput.nextLine();
        }
        int theNumber = playerInput.nextInt();
        System.out.println("Du skrev: " + theNumber);
    }

    public void forLoop() {
        for (int i = 0; i < 11; i++) { //Tæller itl 10
            System.out.println(i);
        }
    }
public void forEach() {
    ArrayList<String> list = new ArrayList<>();
    list.add("Danny");
    list.add("Mo");
    list.add("Peter");

    int counter = 0;
    for (String e : list) { //For hver String e der er i listen
        System.out.println("#" + counter + " " + e); // Så printer den counteren ud
        counter++;
    }

}


}
