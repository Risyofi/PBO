package modul7.latihan;

public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan K1 = new Karyawan();
        K1.setNama("Luffy");
        K1.setGaji(2500000);
        K1.setUsia(21);

        System.out.println(
            "Nama : " + K1.getNama() + "\n" + 
            "Gaji : " + K1.getGaji() + "\n" + 
            "Usia : " + K1.getUsia() + "\n" 
        );
    }
    
}
