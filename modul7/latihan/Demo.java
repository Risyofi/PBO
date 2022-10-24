package modul7.latihan;

public class Demo {
    public static void main(String[] args) {
        Manager M1 = new Manager();
        M1.setNama("Irfan");
        M1.setJamKerja();
        M1.setGaji(2500000);
        M1.setUsia(22);
        M1.printInfo();
        
        Manager M2 = new Manager();
        M2.setNama("Abidin");
        M2.setJamKerja();
        M2.setGaji(2000000);
        M2.setUsia(19);
        M2.printInfo();
        
        Manager M3 = new Manager();
        M3.setNama("Muhammad");
        M3.setJamKerja();
        M3.setGaji(3000000);
        M3.setUsia(25);
        M3.printInfo();
        
        Manager M4 = new Manager();
        M4.setNama("Dewi");
        M4.setJamKerja();
        M4.setGaji(4000000);
        M4.setUsia(26);
        M4.printInfo();
        
        Manager M5 = new Manager();
        M5.setNama("Indah");
        M5.setJamKerja();
        M5.setGaji(2500000);
        M5.setUsia(20);
        M5.printInfo();
        
    }
}
