public class StringMethods {
    public static void main(String[] args) {
        String text = "Hej dette er en tekst";

        String subString = text.substring(0, 3);
        System.out.println("Substringen er: " + subString);
        System.out.println("Det sidste bogstav er: " + text.charAt(10));


        double tal = 27.249812;
        System.out.println((int)tal); // Tyoe-casting
        System.out.printf("%.2f", tal); // Gør så det kun er 2 decimaler der bliver printet ud
    }
}
