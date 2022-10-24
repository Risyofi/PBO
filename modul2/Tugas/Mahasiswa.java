package modul2.Tugas;

public class Mahasiswa {
    static String nama;
    static String nim;
    static String alamat;
    static int semester;

    void tampilkanNama(String value){
        nama = value;
    }

    void tampilkanNim(String value){
        nim = value;
    }

    void tampilkanAlamat(String value){
        alamat = value;
    }

    void tampilkanSemester(int value){
        semester = value;
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.tampilkanNama("Irfan");
        mhs.tampilkanNim("L200210021");
        mhs.tampilkanAlamat("Solo");
        mhs.tampilkanSemester(3);

        System.out.println(
            "Nama     : " + nama + "\n" +
            "NIM      : " + nim + "\n" +
            "Alamat   : " + alamat + "\n" +
            "Semester : " + semester 
        );
    }
}
