

public class Persegi extends BangunDatar{
    double sisi;

    double hitungLuas(){
        luas = sisi * sisi;
        System.out.println("Luas Persegi :" + luas);
        return luas;
    }

    double hitungKeliling(){
        keliling = 4 * sisi;
        System.out.println("Keliling Persegi :" + keliling + "\n");
        return keliling;
    }
    
}
