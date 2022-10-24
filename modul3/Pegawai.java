package modul3;

import java.util.Random;

public class Pegawai {
    String nama;
    int nip;
    double gaji;

    void beriNama(String value){
        nama = value;
    }

    void beriNip(){
        Random random = new Random();
        nip = random.nextInt(10000);
    }   

    void beriGaji(double value){
        gaji = value;
    }

    void printInfo(){
        System.out.println(
            "Nama : " + nama + "\n" +
            "nip  : " + nip + "\n" +
            "Gaji : Rp. " + gaji + "\n" +
            "-------------------------------" + "\n"
        );
    }

    public static void main(String[] args) {
        Pegawai Budi = new Pegawai();

        Budi.beriNama("Budi");
        Budi.beriGaji(7000000);
        Budi.beriNip();
        Budi.printInfo();

        Pegawai Dewi = new Pegawai();
        Dewi.beriNama("Dewi");
        Dewi.beriGaji(8500000);
        Dewi.beriNip();
        Dewi.printInfo();

        Pegawai Dian = new Pegawai();
        Dian.beriNama("Dian");
        Dian.beriGaji(5000000);
        Dian.beriNip();
        Dian.printInfo();

        Pegawai Agung = new Pegawai();
        Agung.beriNama("Agung");
        Agung.beriGaji(3000000);
        Agung.beriNip();
        Agung.printInfo();

        Pegawai Edo = new Pegawai();
        Edo.beriNama("Edo");
        Edo.beriGaji(5000000);
        Edo.beriNip();
        Edo.printInfo();
   }
}
