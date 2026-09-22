package jobseet6;

import java.util.Scanner;

public class Pemilihan2Percobaan325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi
        String kategori;
        int penghasilan, gaji_bersih;
        double pajak = 0;
        //input
        System.out.println("Masukkan Kategori : ");
        kategori = sc.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = sc.nextInt();
        //pemilihan
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak =0.1;
            } else if (penghasilan <= 3000000) {
                pajak =0.15; 
            } else{
                pajak =0.2;
            }
        } else if (kategori.equalsIgnoreCase("pembisnis")) {
            if (penghasilan <= 2500000) {
                pajak =0.15;
            } else if (penghasilan <= 3000000) {
                pajak =0.2;
            } else{
                System.out.println("Kategori yang anda masukkan salah!");
                pajak =0.25;
            }  
        } else {
            System.out.println("Kategori yang anda masukkan salah!");
        }


        //perhitungan gaji bersih
        gaji_bersih = (int) (penghasilan - (penghasilan * pajak));

        //ouput gaji bersih
        System.out.println("Gaji bersih : " + gaji_bersih);
        sc.close();
    }
}
