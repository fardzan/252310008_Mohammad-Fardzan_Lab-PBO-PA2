package Praktikum1;

import java.util.Scanner;

public class Objek {
	public static void main(String[] args) {
		int panjang, lebar, hasil;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukkan panjang: ");
		panjang=scanner.nextInt();
		System.out.println("Masukkan lebar: ");
		lebar=scanner.nextInt();
		hasil=panjang * lebar;
		System.out.println("hasil:"+hasil);
	}
}
