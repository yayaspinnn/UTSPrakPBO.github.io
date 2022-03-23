package data;

public class LaptopApp {

    public static void main(String[] args) {
        System.out.println("---==============---");
        System.out.println("        OUTPUT      ");
        System.out.println("---==============---");
        Laptop laptop1 = new Laptop();
        System.out.println("\nNama Laptop\t\t\t : "+laptop1.getNama());
        System.out.println("Brand Laptop\t\t : "+laptop1.getBrand());
        System.out.println("Processor Laptop\t : "+laptop1.getProcessor());
        System.out.println("Jumlah Core\t\t\t : "+laptop1.getJumlahCore());
        System.out.println("Operasi Sistem\t\t : "+laptop1.getOS());
        System.out.println("RAM\t\t\t\t\t : "+laptop1.getRAM());
        System.out.println("Storage\t\t\t\t : "+laptop1.getStorage());
        System.out.println("Stok\t\t\t\t: "+laptop1.getStok()+"\n");

        Laptop laptop2 = new Laptop("Lenovo ThinkPad P15", "Lenovo", "Intel Xeon W-10855M Hexa Core",
                "6 Core", "Windows 11", "128GB", "SSD SATA", 4);
        System.out.println(laptop2);
    }
}
