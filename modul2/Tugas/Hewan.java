package modul2.Tugas;

public class Hewan {
    int kaki;
    String nama;
    String makanan;
    String type;

    void beriNama(String value){
        nama = value;
    }

    void beriKaki(int value){
        kaki = value;
    }
    
    void beriMakanan(String value){
        makanan = value;
    }

    void beriType(String value){
        type = value;
    }

    void printInfo(){
        System.out.println(
            "Nama Hewan     : " + nama + "\n" +
            "Jumlah Kaki    : " + kaki + "\n" +
            "Makanan        : " + makanan + "\n" +
            "Type Hewan     : " + type + "\n" 
        );
    }

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
