import java.util.Scanner;

public class Kursus {
    private int duration;
    private String tglDaft;
    private String tglMasuk;
    private double biayaDaftar = 10000;
    private String namaKursus = "WebOperation";

    public String getNamaKursus() {
        return namaKursus;
    }

    public void register(String tglDaft, String tglMasuk, int duration) {
        this.tglDaft = tglDaft;
        this.tglMasuk = tglMasuk;
        this.duration = duration;
    }
    int pilihan;
    static Scanner sc = new Scanner(System.in);
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Tanggal Daftar : ");
        tglDaft = input.next();
        System.out.print("Tanggal Masuk  : ");
        tglMasuk = input.next();
        System.out.print("Durasi Kursus (Hari) : ");
        duration = input.nextInt();
    }


    // Tampilkan menu

    public void tipeKelas(){

            System.out.println("\nMenu Jenis Kursus " + namaKursus);
            System.out.println("Pilihlah Tipe kelas yang anda pilih");
            System.out.println("1. Phyton");
            System.out.println("2. Java");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // menghapus baris kosong setelah input integer
            if (pilihan == 1) {
                System.out.println("\nTipe kelas:");
                System.out.println("--- Python ---");
                System.out.println("Anda telah memilih tipe kelas Phyton.");
            } else if (pilihan == 2) {
                System.out.println("\nTipe kelas:");
                System.out.println("--- Python ---");
                System.out.println("Anda telah memilih tipe kelas Phyton.");
            }else {
                    System.out.println("Pilihan anda tidak valid!!!");
            }
    }
    public void getDetails() {
        Costumer costumer = new Costumer();
     //   System.out.println("Nama Anda      : " + this.x.getNamaCost());
        System.out.println("\nTanggal Daftar : " + this.tglDaft);
        System.out.println("Tanggal Masuk  : " + this.tglMasuk);
        //System.out.println("Tipe Kelas yang dipilih :" + tipeKelas(););
        System.out.println("Durasi Hari    : " + this.duration+" hari");
    }
}
