import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Java extends JenisKursus{

    Scanner in = new Scanner(System.in);
    public Java(){
        super("Java",45000);
    }
    public int bayar ;
    @Override
    public int getFee() {
        return fee;
    }
    public void daftar(){
        System.out.println(" KURSUS "+name);
        System.out.println(" Harga /hari : "+getFee());
        System.out.println(" Daftar? [1/0]");
        int a = in.nextInt();
        if (a == 1){
            System.out.println("Masukkan jumlah hari : ");
            int hari = in.nextInt();
            System.out.println("Anda berhasil terdaftar pada kelas Python!");
            bayar = harga(getFee(), hari);
            System.out.println("Total Harga : "+harga(getFee(),hari));
        }
        else {
            System.out.println("Kembali");
        }
    }
    public int harga(int biaya, int hari){
        return biaya*hari;
    }
    public void cetakStruk(String nama, int id, String nama_kursus, String jenis_kelas, int biaya){
        try {
            // membuat object BufferedWriter dengan menggunakan object FileWriter
            BufferedWriter tulis = new BufferedWriter(new FileWriter("src\\struk.txt"));
            // menulis string ke file
            tulis.write("=================================\n");
            tulis.write("STRUK PEMBAYARAN \n");
            tulis.write("=================================\n");
            tulis.write("Nama : "+nama+"\n");
            tulis.write("ID : "+id+"\n");
            tulis.write("Nama Kursus : "+nama_kursus+"\n");
            tulis.write("Jenis Kelas :"+jenis_kelas+"\n");
            tulis.write("Total Biaya :"+ biaya+"\n");
            tulis.write("=================================\n\n");

            // menutup file
            tulis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
