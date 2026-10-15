import java.util.Scanner;

public class Resto {

    private long harga; 
    
    public void chooseMenu() {
        Scanner scanner = new Scanner(System.in);
        String ulang;
        
        do {
            System.out.println("\n=== MENU RESTO ===");
            System.out.println("1. Nasi Goreng - Rp 22.000,-");
            System.out.println("2. Bubur Ayam - Rp 15.000,-");
            System.out.println("3. Soto Ayam - Rp 25.000,-");
            System.out.print("Pilih menu (1/2/3): ");
            
            int pilihan = scanner.nextInt();
            
            this.harga = getPrices(pilihan); 
            
            if (this.harga > 0) {
                System.out.println("Harga pesanan Anda: Rp " + String.format("%,d", this.harga) + ",-");
            } else {
                System.out.println("Maaf menu yang anda masukan salah.");
            }
            
            System.out.print("Apakah anda akan memesan kembali?(y/n): ");
            ulang = scanner.next();
            
        } while (ulang.equalsIgnoreCase("y"));
        
        System.out.println("Terimakasih telah memesan.");
    }
    
    private long getPrices(int pilihan) {
        switch (pilihan) {
            case 1: return 22000L;
            case 2: return 15000L;
            case 3: return 25000L;
            default: return 0L;
        }
    }
}