package jobseet6;

import java.util.Scanner;

public class Tugas3sepatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merek,kategori;
        int ukuran,harga = 0;


        System.out.println("--------------------------");
        System.out.println("====== KEDAI SEPATU ======");
        System.out.println("--------------------------");
        System.out.println("Merek    Kategori");
        System.out.println("conver   (slip on/high top)");
        System.out.println("sketvher (women/man)");
        System.out.println("nike     (kids/adult)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan merek sepatu = ");
        merek = sc.nextLine();
        System.out.print("Masukkan kategori = ");
        kategori = sc.nextLine();
        System.out.print("Masukkan ukuran = ");
        ukuran = sc.nextInt();

        if (merek.equalsIgnoreCase("conver")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                harga = 800000;
                if (ukuran >= 36){
                } else if (ukuran <= 40){
                } else{
                    System.out.println("Tidak ditemukan");
                }
            } else if (kategori.equalsIgnoreCase("high top")){
                harga = 1200000;
                if (ukuran >= 40) {
                } else if (ukuran <= 44) {
                } else {
                    System.out.println("tidak ditemukan");
                }
            } else {
                System.out.println("tidak ditemukan");
            }
        } else if(merek.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("women")) {
                harga =1000000;
                if (ukuran >= 36){
                } else if (ukuran <= 41){
                } else{
                    System.out.println("Tidak ditemukan");
                }
            } else if (kategori.equalsIgnoreCase("man")){
                harga = 1800000;
                if (ukuran >= 40) {
                } else if (ukuran <= 44) {
                } else {
                    System.out.println("tidak ditemukan");
                }
            } else {
                System.out.println("tidak ditemukan");
            }
            
        } else if(merek.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                harga =750000;
                if (ukuran >= 36){
                } else if (ukuran <= 40){
                } else{
                    System.out.println("Tidak ditemukan");
                }
            } else if (kategori.equalsIgnoreCase("adult")){
                harga = 1500000;
                if (ukuran >= 40) {
                } else if (ukuran <= 44) {
                } else {
                    System.out.println("tidak ditemukan");
                }
            } else {
                System.out.println("tidak ditemukan");
            }
        } else {
            System.out.println("tidak ditemukan");
        }

        System.out.println("Harga = Rp. " +harga);
        sc.close();
    }
}
