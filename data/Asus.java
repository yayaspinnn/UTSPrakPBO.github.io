package data;

public class Asus extends Laptop{
    String display, graphic, storefront;

    public Asus(String nama, String brand, String processor, String jumlahCore, String OS,
                String RAM, String storage, int stok){
        super(nama, brand, processor, jumlahCore, OS, RAM, storage, stok);
        getStorefront();
        Stok();
    }

    public void Stok(){
        if (stok <= 0) {
            stok = 0;
        }
    }

    public String getDisplay() {
        System.out.println("Display     : 17.3 Inch FHD");
        return display;
    }

    public void getGraphic() {
        System.out.println("Graphic     : 8GB GDDR6  NVIDIA® GeForce RTX™ 2080");
    }

    public String getStorefront() {
        if (storage == "SSD M.2") {
            storefront = "Best";
        } else if(storage == "SSD SATA"){
            storefront = "Good";
        } else if(storage == "HDD"){
            storefront = "Middle";
        } else {
            storefront = "Unknown";
        }
        return storefront;
    }

    public String toString(){
        return "Nama laptop\t\t\t : "+nama
                +"\nBrand laptop         : "+brand
                +"\nProcessor laptop     : "+processor
                +"\nJumlah Core          : "+jmlhCore
                +"\nOperasi Sistem       : "+OS
                +"\nRAM                  : "+RAM
                +"\nStorage              : "+storage
                +"\nStok tersedia        : "+stok+"\n";
    }
}
