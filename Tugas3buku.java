package jobseet6;

import java.util.Scanner;

public class Tugas3buku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon = 0;
        String buku;
        int jml_buku;

        System.out.print("Masukan buku yang anda beli (komik/novel/lainnya) = ");
        buku = sc.nextLine();
        System.out.print("Masukan jumlah yang anda beli = ");
        jml_buku = sc.nextInt();

        if (buku.equalsIgnoreCase("komik")) {
            diskon = 0.10;
            if (jml_buku >= 2 ) {
                diskon += 0.2 ;               
            } else {
                diskon = 0;              
            }
        } else if (buku.equalsIgnoreCase("novel")) {
            diskon = 0.10;
            if (jml_buku >3) {
                diskon += 0.2;
            } else if (jml_buku <= 3 ){
                diskon += 0.1 ;
            } else {
                diskon = 0;            
            }
        } else {
            if (jml_buku >3) {
                diskon = 0.5;
            } else {
              diskon = 0;
            }
        }
        System.out.println("mendapat diskon = " + (diskon * 100) + "%");

        sc.close();
    }
    
}
