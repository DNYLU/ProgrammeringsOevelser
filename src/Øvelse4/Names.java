package Øvelse4;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName) {

        String nameParts[] = fullName.split(" "); //Splitter det fulde navm i forhold til "mellemrum"

        for (int i = 0; i < nameParts.length; i++) { // Print alle elementerne fra array'en ud
            System.out.println(nameParts[i]);
        }

        if (lastName != "") {
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        }
        System.out.println(firstName + " " + lastName);

        fullName.toString(); //Også toString, men bruges ikke
    }

    public String toString() { //Metode, men bruges ikke her
        return firstName + " " + middleName + "" + lastName;
    }
}
