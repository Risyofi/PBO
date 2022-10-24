package modul2.Tugas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dosen {
    static String nama;
    static int nik;
    static String pendidikan;
    static Date tglLahir; 

    void tampilkanNama(String value){
        nama = value;
    }

    void tampilkanTglLahir(String value) throws ParseException  {
       SimpleDateFormat input = new SimpleDateFormat("dd-MM-yyyy");
       tglLahir = input.parse(value);
    }

    void tampilkanNik(int value){
        nik = value;
    }

    public static void main(String[] args) throws ParseException {
        pendidikan = "S2";

        Dosen dosen = new Dosen();
        dosen.tampilkanNama("Irfan");
        dosen.tampilkanNik(200210021);
        dosen.tampilkanTglLahir("14-05-2003");
        
        System.out.println(
            "Nama           : " + nama + "\n" +
            "NIK            : " + nik + "\n" +
            "Pendidikan     : " + pendidikan + "\n" +
            "Tanggal Lahir  : " + new SimpleDateFormat("dd-MM-yyyy").format(tglLahir) + "\n" 
        );
    }
    
}
