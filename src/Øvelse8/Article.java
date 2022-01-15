package Øvelse8;

public class Article {
    private String heading;
    private String body;
    private String author;

    public Article(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }



    public String getLongestWord() {
        String longestWord = "";
        String[] bodyArray = this.body.split(" ");

       // this.body.replaceAll("[^a-åA-Å] + [,:-]", "");
        for (int i = 0; i < bodyArray.length; i++) {
            // Skifter komma(,) ud med mellemrum
            String word = bodyArray[i].replaceAll("[:,.]", "");
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Det længste ord er: " + longestWord);
        return longestWord;
    }

    public String[] getWords() {
        String[] bodyArray = this.body.split(" ");
        String uniqueWords = "";
        for (int i = 0; i < bodyArray.length; i++) {
            if (!uniqueWords.contains(bodyArray[i])) {
                uniqueWords += " " + bodyArray[i].replaceAll("[:,.]", "");
            }
        }
        System.out.println(uniqueWords);
        return uniqueWords.trim().split("\n");
    }

}
