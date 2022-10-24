

public class PersegiPanjang extends BangunDatar{
    int panjang;
    double lebar;

    double hitungLuas(){
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang : " + luas);
        return luas;

    }

    double hitungKeliling(){
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang : " + keliling + "\n");
        return keliling;

    }
}
