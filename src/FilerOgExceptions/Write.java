package FilerOgExceptions;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;


public class Write {
    public static void main(String[] args) {
        new Write().writeToFile();

    }

    public void writeToFile() { // Try-catch er så tæt på kilden som muligt. Throws smider den videre til den næste
        try { //Stopper koden fra starten, hvis den finder en fejl, da den prøver "det hele" samlet
            String fileName = "TextFile";
            File file = new File(fileName);
            PrintStream printStream = new PrintStream(fileName);
            printStream.println("Hej, jeg hedder Danny");
        } catch (IOException e) { // Hvis der kommer en fejl, så får vi denne fejlbesked
            System.out.println("No file found");
        }
    }
}
