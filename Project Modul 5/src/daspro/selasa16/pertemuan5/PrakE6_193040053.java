package daspro.selasa16.pertemuan5;
import java.util.Scanner;
public class PrakE6_193040053 {
	static Scanner sc = new Scanner(System.in);
	public static int penjumlahan(int a, int b) {
		int hasil = 0;
		hasil = a + b;
		return hasil;
	}
	
	public static int pengurangan(int a, int b) {
		int hasil = 0;
		hasil = a - b;
		return hasil;
	}
	
	public static int perkalian(int a, int b) {
		int hasil = 0;
		hasil = a * b;
		return hasil;
	}
	
	public static double pembagian(int a, int b) {
		double hasil = 0;
		hasil = a / b;	
		return hasil;
	}
	
	public static String menu() {
		String pilihan = "";
		System.out.println("Selamat datang di kalkulator sederhana ini");
		System.out.println("Silahkan memilih menu berikut:");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.println("Menu apakah yang akan anda pilih");
		pilihan = sc.next();
		return pilihan;
	}
	
	
	public static void main(String[] args) {	
		String sMenu = menu();
		int hasil = 0;
		double dHasil = 0;
		int angka1 = 5;
		int angka2 = 2;
		switch (sMenu) {
		case "1":
			hasil = penjumlahan(angka1, angka2);
			System.out.println("hasil = " + hasil);
			break;
		case "2":
			hasil = pengurangan(angka1, angka2);
			System.out.println("hasil = " + hasil);
			break;
		case "3":
			hasil = perkalian(angka1, angka2);
			System.out.println("hasil = " + hasil);
			break;
		case "4":
			dHasil = pembagian(angka1, angka2);
			System.out.println("hasil = " + dHasil);
			break;
		default:
			System.out.println("menu hanya sampai 4");
			break;
		}
	}
}
