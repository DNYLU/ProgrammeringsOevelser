package Repetitionsopgaver;

public class Figurer {
    private int userInput;
    private String s;

    public void figur(int userInput, String s) {
        this.userInput = userInput;
        this.s = s;

        if (userInput <= 0 || userInput > 100) {
            System.out.println("Det indtastede tal er 0 eller mindre");
        } else {
            for (int i = 0; i < userInput; i++) {
                for (int j = 0; j < userInput; j++) { //Nested loop
                    System.out.print(s);
                }
                System.out.println();
            }
        }
    }
}
