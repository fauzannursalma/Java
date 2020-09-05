package ac.ifunpas.praktikum.daspro.tugas;

public class Record {
	private String sNama;  // Nama
	private int iUmur;     // Umur
	private double dTinggi;// Tinggi Badan
	private double dBerat; // Berat Badan
	
    public void setsNama(String sNama){
        this.sNama = sNama;
    }
    public String getsNama(){
        return sNama;
    }
    public void setiUmur(int iUmur) {
        this.iUmur =iUmur;
    }
    public int getiUmur(){
        return iUmur;
    }
    public void setdTinggi(double dTinggi){
        this.dTinggi = dTinggi;
    }
    public double getdTinggi(){
        return dTinggi;
    }
    public void setdBerat(double dBerat){
        this.dBerat = dBerat;
    }
    public double getdBerat(){
        return dBerat;
    }
}
