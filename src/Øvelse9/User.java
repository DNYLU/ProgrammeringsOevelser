package Øvelse9;

import java.util.Random;

public class User {
    private String userId;
    private String fullName;

    public void run() {
        System.out.println(this.validUserId(this.userId));
        System.out.println(this.validUserId("testing123"));
    }

    public User(String fullName) {
        this.fullName = fullName;
    }

    public boolean validUserId(String userId) {
        boolean idIsValid;

        if (userId.length() != 4) {
            idIsValid = true;
        } else {
            idIsValid = false;
        }

        for (int i = 0; i < 4; i++) {
            if (userId.charAt(i) < 'a' || userId.charAt(i) > 'z') {
                idIsValid = false;
            }
        }

        for (int i = 4; i < 8; i++) {
            if (userId.charAt(i) < '0' || userId.charAt(i) > '9') {
                idIsValid = false;
            }
        }

        return idIsValid;
    }

    public void createUserId() {
        Random random = new Random();
        String userId = "";
        String[] fullNameArray = this.fullName.split(" ");

        userId += fullNameArray[0].toLowerCase().charAt(0);
        userId += fullNameArray[0].toLowerCase().charAt(1);
        userId += fullNameArray[1].toLowerCase().charAt(0);
        userId += fullNameArray[1].toLowerCase().charAt(1);

        for (int i = 0; i < 4; i++) {
            userId += random.nextInt(10);
        }

        this.userId = userId;
        System.out.println(userId);
    }

}
