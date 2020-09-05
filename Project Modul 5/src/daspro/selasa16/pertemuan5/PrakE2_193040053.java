package daspro.selasa16.pertemuan5;
import java.util.Scanner;
public class PrakE2_193040053 {
	static Scanner sc = new Scanner(System.in);
	// variabel global yang dapat diakses oleh method atau main program
	
	public static void sapaDunia() {
		System.out.println("Hallo Dunia");
	}
	
	public static void tulisNama() {
		System.out.println("Masukan Nama : ");
		String nama = sc.next();
		// Variabel local method, hanya dapat dikenali didalam method 
		System.out.println("Nama saya adalah : " + nama);
	}
	
	public static void main(String[] args) {
		sapaDunia();
		tulisNama();
	}
}
