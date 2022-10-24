package modul2.Tugas;

public class HewanDemo {
    public static void main(String[] args) {
        Hewan Harimau = new Hewan();
        Hewan Kerbau = new Hewan();

        Harimau.beriNama("Harimau");
        Harimau.beriKaki(4);
        Harimau.beriMakanan("Daging");
        Harimau.beriType("Karnivora");
        Harimau.printInfo();

        Kerbau.beriNama("Kerbau");
        Kerbau.beriKaki(4);
        Kerbau.beriMakanan("Rumput");
        Kerbau.beriType("Herbivora");
        Kerbau.printInfo();

        
    }
}
