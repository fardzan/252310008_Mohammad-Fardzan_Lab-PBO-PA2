import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NPM Anda: ");
        long npm = scanner.nextLong();
        
        boolean isPrima = true;
        
        if (npm < 2) {
            isPrima = false;
        } else {
            for (long i = 2; i <= Math.sqrt(npm); i++) {
                if (npm % i == 0) {
                    isPrima = false;
                    break;
                }
            }
        }
        
        if (isPrima) {
            System.out.println(npm + " Termasuk bilangan PRIMA");
        } else {
            System.out.println(npm + " Bukan termasuk bilangan prima karena dapat dibagi dengan " + 
                             (npm % 2 == 0 ? "2" : "bilangan lain"));
        }
        
        scanner.close();
    }
}