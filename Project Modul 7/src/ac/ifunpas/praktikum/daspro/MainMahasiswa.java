package ac.ifunpas.praktikum.daspro;
import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan NRP: ");
        String nrp = sc.next();
        mhs.setsNrp(nrp);
        System.out.println("Masukkan Nama: ");
        String nama = sc.next();
        mhs.setsNama(nama);
        System.out.println("Masukkan Nilai: ");
        int nilai = sc.nextInt();
        mhs.setiNilai(nilai);
        System.out.println("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        mhs.setdIPK(ipk);
        
        System.out.println("NRP: " + mhs.getsNrp());
        System.out.println("Nama: " + mhs.getsNama());
        System.out.println("Nilai: " + mhs.getiNilai());
        System.out.println("IPK: " + mhs.getdIPK());
    }
}
