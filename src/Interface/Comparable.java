package Interface;//Alle er public abstract i et interface

// Interface siger hvilke metoder en klasse SKAL have.
// Hver klasse der implementerer et interface skal have dens metoder, men det er op til klassen selv hvad metoden gør

public interface Comparable { //Her laves en lokal comparable
    int compareTo(Object o);
    // String color = "Blue";
}
