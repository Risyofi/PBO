package modul2.Tugas;

public class Karyawan {
    static String nama;
    static String alamat;
    static String jabatan;
    static double gaji;

    void tampilkanNama(String value){
        nama = value;
    }

    void tampilkanJabatan(String value){
        jabatan = value;
    }

    void tampilkanAlamat(String value){
        alamat = value;
    }

    void tampilkanGaji(double value){
        gaji = value;
    }

    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan();
        
        karyawan1.tampilkanNama("Irfan");
        karyawan1.tampilkanJabatan("Dosen");
        karyawan1.tampilkanAlamat("Solo");
        karyawan1.tampilkanGaji(7000000);
        
        System.out.println(
            "Nama       : " + nama + "\n" +
            "Jabatan    : " + jabatan + "\n" +
            "Alamat     : " + alamat + "\n" +
            "Gaji       : Rp. " + gaji + "\n" 
        );

        
        
    }
}
