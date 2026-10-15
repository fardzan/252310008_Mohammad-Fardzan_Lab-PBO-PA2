import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;
        
        do {
            System.out.println("\n=== MENU SARAPAN ===");
            System.out.println("1. Nasi Goreng - Rp 22.000,-");
            System.out.println("2. Bubur Ayam - Rp 15.000,-");
            System.out.println("3. Soto Ayam - Rp 25.000,-");
            System.out.print("Pilih menu (1/2/3): ");
            
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1: System.out.println("Anda memesan Nasi Goreng dengan harga Rp 22.000,-"); break;
                case 2: System.out.println("Anda memesan Bubur Ayam dengan harga Rp 15.000,-"); break;
                case 3: System.out.println("Anda memesan Soto Ayam dengan harga Rp 25.000,-"); break;
                default: System.out.println("Maaf menu yang anda masukan salah.");
            }
            
            System.out.print("Apakah anda akan memesan kembali?(y/n): ");
            ulang = scanner.next();
            
        } while (ulang.equalsIgnoreCase("y"));
        
        System.out.println("Terimakasih telah memesan.");
        scanner.close();
    }
}