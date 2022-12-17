import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Petugas {
    private String namaPetugas;
    private int idPetugas;

    //getter & setter

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public int getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(int idPetugas) {
        this.idPetugas = idPetugas;
    }

    private double biayaKursus;
    private double biayaAdministrasi;
    private double biayaTotal;

    private double biayaDaft(int k, int c){
        return k*c;
    }

    // Method untuk menghitung total pengeluaran yang harus dibayar
    public void hitungPengeluaran() {
        try {
            biayaTotal = biayaKursus + biayaAdministrasi;
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menghitung pengeluaran: " + e.getMessage());
        }
    }
    public void pembayaran(){
        Costumer cst = new Costumer();
        Kursus kr = new Kursus();

    }

    public void cetakStrukTxt(String namaFile) {
        try {
            FileWriter tulis = new FileWriter(namaFile);
            tulis.write("Struk Pembayaran Kursus\n");
            tulis.write("Biaya kursus: Rp. " + biayaKursus + "\n");
            tulis.write("Biaya administrasi: Rp. " + biayaAdministrasi + "\n");
            tulis.write("Total pembayaran: Rp. "  );
            tulis.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat mencetak struk ke dalam file teks: " + e.getMessage());
        }
    }
}