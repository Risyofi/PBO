package modul2.Latihan;

public class RotiDemo {
    public static void main(String[] args) {
        Roti roti = new Roti();
        roti.beriWarna("Hijau");
        roti.beriRasa("Pandan");
        roti.timbangBerat(40);
        roti.hargaJual(6000);
        roti.infoRoti();

        Roti rotiDonat = new Roti();
        rotiDonat.beriWarna("Coklat");
        rotiDonat.beriRasa("Keju");
        rotiDonat.timbangBerat(60);
        rotiDonat.hargaJual(8000);
        rotiDonat.infoRoti();

        Roti rotiBolu = new Roti();
        rotiBolu.beriWarna("Hitam");
        rotiBolu.beriRasa("Coklat");
        rotiBolu.timbangBerat(100);
        rotiBolu.hargaJual(15000);
        rotiBolu.infoRoti();

        Roti rotiBakar = new Roti();
        rotiBakar.beriWarna("Putih");
        rotiBakar.beriRasa("Strawberry");
        rotiBakar.timbangBerat(120);
        rotiBakar.hargaJual(13000);
        rotiBakar.infoRoti();
           
    }
}
