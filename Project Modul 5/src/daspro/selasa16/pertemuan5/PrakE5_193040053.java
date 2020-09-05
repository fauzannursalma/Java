package daspro.selasa16.pertemuan5;
import java.util.Scanner;
public class PrakE5_193040053 {
	static Scanner sc = new Scanner(System.in);
	// Variabel global yang dapat diakses oleh method  ataupun main program
	static double PHI = 3.14;
	
	public static double luasLingkaran () {
		System.out.print("Masukan jari-jari: ");
		double jari2 = sc.nextDouble();
		double luas = PHI * (jari2*jari2);
		return luas;	
	}
	
	public static void main(String[] args) {
		double hasil = luasLingkaran();
		System.out.println(hasil);
	}
}
