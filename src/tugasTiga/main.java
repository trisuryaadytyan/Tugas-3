package tugasTiga;

import java.util.Scanner;
import tugasTiga.sepedamotor;

public class main {

    public static void main(String[] args) {
        int x;

        Scanner w = new Scanner(System.in);

        System.out.println("Silahkan pilih: ");
        System.out.println("1. Mobil\n2. Sepeda Motor");
        System.out.println("Masukkan pilihan 1 atau 2 :");
        x = w.nextInt();
        System.out.println("===============================================================");

        if (1 == x) {
            mobil m1 = new mobil();
            m1.info();
            if (m1.jarak > 0 && m1.jarak <= 500 && m1.getBahan() > 0 && m1.getBahan() <= 500) {
                if (0.5 >= m1.efektifitas() && 0.0 < m1.efektifitas()) {

                    System.out.println("efektif dengan nilai keefektivitasan : " + m1.efektifitas());
                } else {
                    System.out.println("Tidak efektif");
                }
            } else {
                System.out.println("Tidak ditemukan");
            }
        } else if (2 == x) {
            sepedamotor sm = new sepedamotor();
            sm.info();
            if (sm.jarak > 0 && sm.jarak <= 500 && sm.getBahan() > 0 && sm.getBahan() <= 500) {
                if (0.5 >= sm.efektifitas() && 0.0 < sm.efektifitas()) {
                    System.out.println("efektif dengan nilai keefektivitasan : " + sm.efektifitas());
                } else {
                    System.out.println("Tidak efektif");

                }
            } else {
                System.out.println("Tidak ditemukan");
            }
        } else {
            System.out.println("Input Salah");
        }
        System.out.println("================================================================");

    }
}
