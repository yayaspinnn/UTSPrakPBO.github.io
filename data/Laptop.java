package data;

import java.util.Scanner;

public class Laptop {
    String nama, brand, processor, OS, storage, jmlhCore, RAM;
    int stok;

    Scanner input = new Scanner(System.in);

    public Laptop(){
        this.setNama();
        this.setBrand();
        this.setProcessor();
        this.setJumlahCore();
        this.setOS();
        this.setRAM();
        this.setStorage();
        this.setStok();
    }

    public Laptop(String nama, String brand, String processor, String jumlahCore,
                  String OS, String RAM, String storage, int stok){
        this.nama = nama;
        this.brand = brand;
        this.processor = processor;
        this.jmlhCore = jumlahCore;
        this.OS = OS;
        this.RAM = RAM;
        this.storage = storage;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama() {
        System.out.print("Nama        : ");
        this.nama = input.nextLine();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        System.out.print("Brand       : ");
        this.brand = input.nextLine();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor() {
        System.out.print("Processor   : ");
        this.processor = input.nextLine();
    }

    public String getOS() {
        return OS;
    }

    public void setOS() {
        System.out.print("OS          : ");
        this.OS = input.nextLine();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage() {
        System.out.print("Storage     : ");
        this.storage = input.nextLine();
    }

    public String getJumlahCore() {
        return jmlhCore;
    }

    public void setJumlahCore() {
        System.out.print("Jumlah Core : ");
        this.jmlhCore = input.nextLine();
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM() {
        System.out.print("RAM         : ");
        this.RAM = input.nextLine();
    }

    public int getStok() {
        return stok;
    }

    public void setStok() {
        System.out.print("Stok        : ");
        this.stok = input.nextInt();
    }

    public void getGraphic(){
        System.out.println("Graphic   : GTX3060 XC");
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
