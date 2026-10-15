import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai faktorisasi (min 20): ");
        int angka = scanner.nextInt();
        
        if (angka < 20) {
            System.out.println("Nilai harus lebih dari atau sama dengan 20!");
        } else {
            ArrayList<Integer> faktor = new ArrayList<>();
            
            for (int i = 1; i <= angka; i++) {
                if (angka % i == 0) {
                    faktor.add(i);
                }
            }
            
            Collections.sort(faktor); 
            
            System.out.print("Faktor " + angka + " adalah: ");
            for (int i = 0; i < faktor.size(); i++) {
                System.out.print(faktor.get(i));
                if (i < faktor.size() - 1) System.out.print(", ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}