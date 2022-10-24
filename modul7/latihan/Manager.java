package modul7.latihan;

public class Manager extends Karyawan{
    private float jamKerja = 7.5f;

    public float jamKerja(){
        return jamKerja;
    }

    public void setJamKerja(){
        jamKerja = 8.5f;
    }

    public float getGajiManager(){
        return getGaji() * 2;
    }

    public void printInfo(){
        System.out.println(
            "Nama          : " + getNama() + "\n" + 
            "Usia          : " + getUsia() + "\n" +
            "Jam Kerja     : " + jamKerja() + "\n" +
            "Gaji Karyawan : " + getGaji() + "\n" + 
            "Gaji Managaer : " + getGajiManager() + "\n" 
        );
    }
}
