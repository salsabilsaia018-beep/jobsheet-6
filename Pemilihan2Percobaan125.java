package jobseet6;

import java.util.Scanner;

public class Pemilihan2Percobaan125 {
    public static void main(String[] args) {
        Scanner salsa25 = new Scanner(System.in);

        System.out.print("masukan tahun anda : ");
        int tahun = salsa25.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("tahun kabisat");
        } else {
            System.out.println("buka tahun kabisat");
        }

        salsa25.close();
    }
}
