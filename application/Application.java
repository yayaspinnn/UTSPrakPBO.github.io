package application;

import data.*;

public class Application {
    public static void main(String[] args) {

        Xiaomi xiaomi = new Xiaomi("Redmi Book 15", "Xiaomi", "Intel Core i3-1115G4",
                "2", "Windows 10", "8", "SSD SATA", 9);
        System.out.println("Laptop Xiaomi");
        System.out.println(xiaomi);
        xiaomi.getDisplay();
        xiaomi.getGraphic();
        xiaomi.getStorefront();


        Asus asus = new Asus("ROG Mothership GZ700", "ASUS", "Intel Corei9-9980HK",
                "8", "Windows 10 Pro", "64", "SSD M.2", 1);
        System.out.println("\nLaptop ASUS");
        System.out.println(asus);
        asus.getDisplay();
        asus.getGraphic();
        asus.getStorefront();
    }
}
