import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pinBenar = "252310008";

        long saldo = 500000;
        String pin;

        do {
            System.out.print("Masukkan PIN: ");
            pin = input.nextLine();

            if (!pin.equals(pinBenar)) {
                System.out.println("PIN salah, silakan coba lagi.");
            }
        } while (!pin.equals(pinBenar));

        System.out.println("PIN benar. Selamat datang!");

        boolean keluar = false;

        while (!keluar) {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Masukkan menu: ");

            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan nominal setor tunai: Rp ");
                    long setor = input.nextLong();

                    if (setor > 0) {
                        saldo += setor;
                        System.out.println("Setor tunai berhasil.");
                        System.out.println("Saldo Anda: Rp " + saldo);
                    } else {
                        System.out.println("Nominal tidak valid.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nominal tarik tunai: Rp ");
                    long tarik = input.nextLong();

                    if (tarik <= 0) {
                        System.out.println("Nominal tidak valid.");
                    } else if (saldo >= tarik) {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil.");
                        System.out.println("Saldo Anda: Rp " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup.");
                    }
                    break;

                case 4:
                    System.out.println("Anda memilih keluar.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

            System.out.print(
                "Apakah Anda yakin ingin keluar aplikasi? (Y/N): "
            );
            String konfirmasi = input.next();

            if (konfirmasi.equalsIgnoreCase("Y")) {
                keluar = true;
            } else {
                keluar = false;
            }
        }

        System.out.println("Terima kasih telah menggunakan ATM.");
        input.close();
    }
}