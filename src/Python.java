import java.beans.Customizer;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//inheritance dari class abstract jenis kursus
public class Python extends JenisKursus{
    Scanner in = new Scanner(System.in);
    public Python(){
        super("Python",50000);
    }
    public int bayar;
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
            System.out.println("Anda telah memilih kursus Python!");
            bayar = harga(getFee(),hari);
            System.out.println("Total Harga : "+bayar);
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
