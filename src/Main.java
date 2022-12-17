import java.util.Scanner;

public class Main {
        Main(){
            System.out.println("\t\t ~~Selamat Datang~~");
        }
        static void iya(String helium){
            System.out.println(helium);
        }
        static void name(){
            Kursus k1 = new Kursus();
            System.out.println("||   APLIKASI PENDAFTARAN KURSUS WebOperation t||");
        }
        static void line(){
            System.out.println("==========================================");
        }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            Main tata= new Main();
            iya("\t\tdiprogram tata alyssa");
            iya("\t\t\t 2100018315");
            Petugas petugas = new Petugas();
            petugas.setIdPetugas(60312228);
            petugas.setNamaPetugas("Hamada Asahi");
            //Pemanggilan Prosedur
            line();
            name();
            line();

            int pilih=0;
            Costumer plg = new Costumer();
            plg.input_cost();
            while (pilih!=3){
                System.out.println("Daftar Kursus : ");
                System.out.println("1. Java");
                System.out.println("2. Python");
                System.out.println("3. Keluar");
                pilih = in.nextInt();
                if (pilih == 1){
                    Java java = new Java();
                    java.daftar();
                    plg.setBiaya(plg.getBiaya()+java.bayar);
                    plg.jenisKelas();
                    System.out.println("Total Biaya : "+plg.getBiaya());
                    System.out.println("Struk Anda Telah Di Cetak!");
                    java.cetakStruk(plg.getNamaCost(),plg.getIdCost(), java.name, plg.jenis, plg.getBiaya());

                }
                else if (pilih == 2){
                    Python py = new Python();
                    py.daftar();
                    plg.setBiaya(plg.getBiaya()+ py.bayar);
                    plg.jenisKelas();
                    System.out.println("Total Biaya : "+plg.getBiaya());
                    System.out.println("Struk telah dicetak!");
                    py.cetakStruk(plg.getNamaCost(),plg.getIdCost(), py.name, plg.jenis, plg.getBiaya());
                }
                else {
                    System.out.println("Anda Berhasil Keluar");
                }
            }

//            System.out.println("Nama Petugas : " + p.getNamaPetugas());
//            System.out.println("Id Petugas   : " + p.getIdPetugas());
        }

}