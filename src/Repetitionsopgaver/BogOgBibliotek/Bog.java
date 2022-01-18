package Repetitionsopgaver.BogOgBibliotek;

public class Bog {
    private int ISBN;
    private String title;
    private String author;
    private int releaseYear;

    public Bog(int ISBN, String title, String author, int releaseYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
