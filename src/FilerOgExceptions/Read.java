package FilerOgExceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        new Read().readFromFile();
    }

    public void readFromFile() {
        try {
            String fileName = "TextFile";
            File file = new File(fileName);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) { // Tjekker om der er en linje
                String lines = scan.nextLine(); // Den går ned og scanner linjen
                System.out.println(lines);
            }
        } catch (IOException e) {
            System.out.println("File could not be found");
        }
    }
}
