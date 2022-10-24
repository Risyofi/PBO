package UTS;

public class Perpustakaan {
    public static void main(String[] args) {
        BUKU buku1 = new BUKU();
        buku1.beriJudul("OO Programing Using Java");
        buku1.beriPengarang("S Kendal");
        buku1.beriTahun(2018);
        buku1.beriJumlah(2);
        buku1.printInfo();
        
        BUKU buku2 = new BUKU();
        buku2.beriJudul("Dasar Teknik Informatika");
        buku2.beriPengarang("Novel Pratama");
        buku2.beriTahun(2018);
        buku2.beriJumlah(3);
        buku2.printInfo();

        BUKU buku3 = new BUKU();
        buku3.beriJudul("Komputer Cerdas");
        buku3.beriPengarang("Nurul Nafiyah");
        buku3.beriTahun(2020);
        buku3.beriJumlah(3);
        buku3.printInfo();
        
        BUKU buku4 = new BUKU();
        buku4.beriJudul("Pengantar Teknologi Informatika");
        buku4.beriPengarang("Muslim Ridho");
        buku4.beriTahun(2017);
        buku4.beriJumlah(5);
        buku4.printInfo(); 
    }
}
