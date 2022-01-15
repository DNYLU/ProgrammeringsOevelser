package Øvelse1;

import java.util.Scanner;

public class Keyword {
    private String word;
    private String definition;
    private String seeAlso;

    Scanner scan = new Scanner(System.in);

    public void matches (String word, String definition) {
        this.word = word;
        this.definition = definition;

        System.out.println("Indtast søgeord: ");
        String userInput = scan.nextLine();
        if (userInput.toLowerCase().equals(word.toLowerCase())) {
            System.out.println(definition);
        } else {
            System.out.println("Søgeordet matcher ikke");
        }
    }
}
