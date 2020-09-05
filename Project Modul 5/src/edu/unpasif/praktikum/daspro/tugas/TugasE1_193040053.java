package edu.unpasif.praktikum.daspro.tugas;
import java.util.Scanner;
public class TugasE1_193040053 {
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
	public static double pembagian(double a, double b) {
		double hasil = 0;
		hasil = a / b;
		return hasil;
	}
	public static double modulus(int a, int b) {
		double hasil = 0;
		hasil = a % b;
		return hasil;
	}
	public static int angka1() {
		int angka1;
		System.out.println("Selamat datang di kalkulator sederhana ini");
		System.out.printf("Masukan Nilai Pertama : ");
		angka1 = sc.nextInt();
		return angka1;
	}
	public static int angka2() {
		int angka2;
		System.out.printf("Masukan Nilai Kedua   : ");
		angka2 = sc.nextInt();
		return angka2;
	}
	
	public static void  menu() {
		System.out.println("Silahkan memilih menu berikut:");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.println("5. Modulus / Sisa Bagi");
		System.out.println("99. Berhenti / Keluar");
		System.out.println("Menu apakah yang akan anda pilih : ");
	}
	
	public static void main(String[] args) {
		int angka1 = angka1();
		int angka2 = angka2();
		menu();
		int pilihan = sc.nextInt();
	do {	
		int hasil = 0;
		double dHasil = 0;
		switch (pilihan) {
		case 1:
			hasil = penjumlahan(angka1, angka2);
			System.out.println("hasil = " + hasil);
			break;
		case 2:
			hasil = pengurangan(angka1, angka2);
			System.out.println("hasil = " + hasil);
			break;
		case 3:
			hasil = perkalian(angka1, angka2);
			System.out.println("hasil = " + hasil);
			break;
		case 4:
			dHasil = pembagian(angka1, angka2);
			System.out.println("hasil = " + dHasil);
			break;
		case 5:
			dHasil = modulus(angka1, angka2);
			System.out.println("hasil = " + dHasil);
			break;
		default:
			System.out.println("menu hanya sampai 5");
			break;
		}
		System.out.println("=====================================");
		menu();
		pilihan = sc.nextInt();	
	} while(pilihan != 99);
	switch(pilihan) {
		case 99:
		System.out.println("Selamat Tinggal dan Sampai Jumpa !");
		break;
	}
	}
}
