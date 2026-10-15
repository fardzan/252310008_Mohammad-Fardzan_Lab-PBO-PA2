import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int row = input.nextInt();

        for (int i = 0; i <= 2 * row; i++) {
            int jarak = Math.min(i, 2 * row - i);
            int bintang = Math.max(1, row - jarak);

            for (int j = 0; j < bintang; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < 2 * jarak; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < bintang; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        input.close();
    }
}