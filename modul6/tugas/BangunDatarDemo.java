

public class BangunDatarDemo {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.hitungLuas();
        bangunDatar.hitungKeliling();

        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        persegi.hitungLuas();
        persegi.hitungKeliling();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 5;
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
      
        SegiTiga sTiga = new SegiTiga();
        SegiTiga.alas = 12;
        sTiga.hitungLuas();
        sTiga.hitungKeliling();

        SegiTigaSamaKaki samaKaki = new SegiTigaSamaKaki();
        samaKaki.sisiMiring = 10;
        samaKaki.hitungLuas();
        samaKaki.hitungKeliling();

        SegiTigaSamaSisi samaSisi = new SegiTigaSamaSisi();
        samaSisi.sisi = 4;
        samaSisi.hitungLuas();
        samaSisi.hitungKeliling();
        

    }
}
