package daspro.selasa16.pertemuan5;
import java.util.Scanner;
public class PrakE4_193040053 {
	static Scanner sc = new Scanner(System.in);
	// Variabel global yang dapat diakses oleh method  ataupun main program
	
	public static void sapaDunia() {
		System.out.println("Hello Dunia");
	}
	
	public static void nilaiMhs(String a, int b, double c) {
		System.out.println("Nama mahasiswa: " + a);
		System.out.println("Nilai mahasiswa: " + b);
		System.out.println("IPK mahasiswa: " + c);
	}
	
	public static void main(String[] args) {
		sapaDunia();
		System.out.println("Masukan Nama: ");
		String nama = sc.next();
		System.out.println("Masukkan Nilai: ");
		int nilai = sc.nextInt();
		System.out.println("Masukan IPK: ");
		double ipk = sc.nextDouble();
		nilaiMhs(nama, nilai, ipk);
	}
}
