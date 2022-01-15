package Øvelse6;

public class Motherboard { //Tilkobling
    SataDrive sataDrive1 = new SataDrive("SataDrive 1", false);
    SataDrive sataDrive2 = new SataDrive("SataDrive 2", false);
    SataDrive sataDrive3 = new SataDrive("SataDrive 3",true);
    SataDrive sataDrive4 = new SataDrive("SataDrive 4",false);
    // Array af typen SataDrive
    SataDrive[] sataDrives = new SataDrive[]{sataDrive1, sataDrive2, sataDrive3, sataDrive4};

    public void showDrives() {
        for (int i = 0; i < sataDrives.length; i++) {
            System.out.println(sataDrives[i]);
        }
    }
}
