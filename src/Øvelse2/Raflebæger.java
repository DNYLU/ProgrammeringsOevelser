package Øvelse2;

import java.util.Random;

public class Raflebæger {
    private int diceAmount;

    public Raflebæger(int diceAmount) {
        this.diceAmount = diceAmount;
    }

    public int Ryst() {
        Random random = new Random();
        int result = random.nextInt(6)*diceAmount;
        result++; // Så tallet ikke bliver 0

        System.out.println("Du slog: " + result);
        return result;
    }

    public void se () {
        System.out.println("Antal øjne: " + diceAmount * 6);
    }
}

