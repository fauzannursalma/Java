package ac.ifunpas.praktikum.daspro.tugas;
import java.util.Scanner;
public class TugasG1_193040053 {
	public static Record rc = new Record();
	public static Scanner scan = new Scanner(System.in);
	
	public static void input() {
		System.out.println("==={ Program Menghitung Body Mass Index (BMI) }===");
		System.out.printf("Masukkan Nama Anda : ");
		String nama = scan.nextLine();
		rc.setsNama(nama);
    
		System.out.printf("Masukkan Umur Anda : ");
		int umur = scan.nextInt();
		rc.setiUmur(umur);
    
		System.out.printf("Masukkan Tinggi Badan (meter *contoh 1.80) : ");
		double tinggi = scan.nextDouble();
		rc.setdTinggi(tinggi);
    
		System.out.printf("Masukkan Berat Badan (kg): ");
		double berat = scan.nextDouble();
		rc.setdBerat(berat);
	}
	 
	public static double bmi(double tinggi, double berat) {
		double tinggi2 = tinggi * tinggi;
		double hasil = berat / tinggi2;
		return hasil;
	}
	
	public static void output() {
		System.out.println("==================================================");
		System.out.println("Nama 		: " + rc.getsNama());
		System.out.println("Umur 		: " + rc.getiUmur() + " tahun");
		double tinggi = rc.getdTinggi();
		double berat = rc.getdBerat();
		System.out.printf("Tinggi Badan 	: %.2f m\n", tinggi);
		System.out.printf("Berat Badan 	: %.0f kg\n", berat );
		System.out.printf("Body Mass Index : %.2f\n", bmi(tinggi,berat) );
		System.out.println("==================================================");
	}
	
	public static void main(String[] args) {
		input();
		output();
	}
}
