package Repetitionsopgaver.BogOgBibliotek;

public class Bibliotek {
    Bog bog1 = new Bog(1, "Ringenes herre", "Tolkien", 1954);
    Bog bog2 = new Bog(2, "Testbog", "Danny", 1999);

    public boolean bibliotekMetode(Bog bog) {
        if (bog.getISBN() == bog1.getISBN() || bog.getISBN() == bog2.getISBN()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Bibliotek bibliotek = new Bibliotek();
      // VIRKER IKKE
    }
}
