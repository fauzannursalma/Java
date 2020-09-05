package daspro.selasa16.pertemuan6;
import java.util.Scanner;
public class PrakF2_193040053 {
	public static void main(String[] args) {
		String [] arrNRP = new String [5];
		Scanner sc = new Scanner(System.in);
		
		for (int indeks = 0; indeks < arrNRP.length; indeks++) {
			System.out.println("Masukan NRP: ");
			arrNRP[indeks] = sc.next();
		}
		
		for (int indeks = 0; indeks < arrNRP.length; indeks++) {
			System.out.println("NRP: " + arrNRP[indeks]);
		}
	}
}
