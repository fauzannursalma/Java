package edu.unpasif.praktikum.daspro.tugas;
import java.util.Scanner;
public class TugasF1_193040053 {
public static int [] array; 
	

// Sub Program Prosedur panjangArray
	public static void panjangArray() {
		System.out.printf("Masukkan Panjang Array : ");
		Scanner scan = new Scanner(System.in);
		int panjangArr = scan.nextInt();
		array = new int[panjangArr];
	}
// Sub Program Prosedur inputArray
	public static void inputArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan nilai pada Array : ");
		for (int inputan = 0; inputan < array.length; inputan++) {
			array[inputan] = scan.nextInt();
		} 
		System.out.println("=============================");
	}
// Sub Program Prosedur elemenArray
	public static void  elemenArray(int[]array) {
		System.out.println("Isi / Elemen Array : ");
		int inputan = 0;
		while(inputan < array.length) {
				System.out.printf("["+ array[inputan] + "] ");
			
			inputan++;
		}
		System.out.println();
		System.out.println("-----------------------------");
	}
// Sub Program Fungsi operasiPenjumlahan
	public static int operasiPenjumlahan(int[]array) {
		int inputan = 0;
		int total = 0;
		do {
			total += array[inputan];
			inputan++;
		} while (inputan < array.length);
		return total;
	}
// Sub Program Prosedur hasilPenjumlahan
	public static void hasilPenjumlahanArray() {
		System.out.println("Hasil penjumlahan dari seluruh isi Array  : \n" + operasiPenjumlahan(array));
		System.out.println("-----------------------------");
	}
// Sub Program Prosedur arrayGanjil
	public static void arrayGanjil(int[]array) {
		int inputan = 0;
		System.out.println("Elemen Array Ganjil : ");
		while(inputan < array.length) {
			if (array[inputan]%2 == 1) {
				System.out.printf("["+ array[inputan] + "] ");	
			}
			inputan++;
		}
		System.out.println("\n-----------------------------");
	}
// Sub Program Prosedur arrayGenap
	public static void arrayGenap(int[]array) {
		int inputan = 0;
		System.out.println("Elemen Array Genap : ");
		while(inputan < array.length) {
			if (array[inputan]%2 == 0) {
				System.out.printf("["+ array[inputan] + "] ");	
			}
			inputan++;
		}
		System.out.println("\n=============================");
	}
// Main Class
	public static void main(String[] args) {
		panjangArray();
		inputArray();
		elemenArray(array);
		hasilPenjumlahanArray();
		arrayGanjil(array);
		arrayGenap(array);	
	}
	
}
