package Øvelse8;

public class Main8 {
    public static void main(String[] args) {
        Article article = new Article("Programmeringsopgave", "Lav en klasse Article der har tre attributter: heading, body og author. Lav test-kode der sætter alle tre attributter, og sørg for" +
                " at body er en lang tekst", "Lu");

        article.getLongestWord();
        article.getWords();
    }


}
