package modul2;

public class Roti {
    String warna;
    String rasa;
    int berat;
    double harga;

    public void beriWarna(String warnaRoti){
        warna = warnaRoti;
    }

    public void beriRasa(String rasaRoti){
        rasa = rasaRoti;
    }

    public void timbangBerat(int beratRoti){
        berat = beratRoti;
    }

    public void hargaJual(double hargaRoti){
        harga = hargaRoti;
    }

    public void infoRoti(){
        System.out.println(
            "Warna Roti : " + warna + "\n" +
            "Rasa Roti  : " + rasa + "\n" +
            "Berat Roti : " + berat + "\n" +
            "Harga Roti : Rp. " + harga + "\n" 
        );
    }
}
