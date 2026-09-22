package jobseet6;

public class Tugas3bilangan {
    public static void main(String[] args) {

        int bil1 = 28;
        int bil2 = 54;
        int bil3 = 15;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("bilangan 1 terbesar " +bil1);
            } else {
                System.out.println("bilangan 3 terbesar " +bil3);
            }
        } else if (bil2 > bil3){
           System.out.println("bilangan 2 terbesar " +bil2);
        } else {
            System.out.println("bilangan 3 terbesar " +bil3);
        }
    }
}
