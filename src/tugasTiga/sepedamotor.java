package tugasTiga;

import java.util.Scanner;

public class sepedamotor extends kendaraan {

    private String nama, tipe;

    public sepedamotor() {
        Scanner sm = new Scanner(System.in);
        System.out.println("Masukkan Nama Sepeda Motor : ");
        nama = sm.nextLine();
        System.out.println("Masukkan Tipe Sepeda Motor : ");
        tipe = sm.nextLine();

    }

    public sepedamotor(String nama, String tipe) {
        this.nama = nama;
        this.tipe = tipe;
    }

    public sepedamotor(String nama, String tipe, int id, float jawal, float jarak, float bahan) {
        super(id, jawal, jarak, bahan);
        this.nama = nama;
        this.tipe = tipe;
    }

    public String getNama() {
        return nama;
    }

    public String getTipe() {
        return tipe;
    }

    public void info() {
        super.info();
        System.out.println("Nama Sepeda Motor : " + nama);
        System.out.println("Tipe Sepeda Motor : " + tipe);

    }
}
