public class SegiTigaSamaKaki extends SegiTiga{
    double sisiMiring;

    double hitungTinggi(){
        double a = SegiTiga.alas / 2;
        double b = Math.pow(a, 2);
        double c = Math.pow(sisiMiring,2);
        double d = c - b;
        double tinggi = Math.sqrt(d);
        return tinggi;
    }
    
    double hitungLuas(){
        luas = (hitungTinggi() * alas)/2;
        System.out.println("Luas Segitiga Sama Kaki : " + luas);
        return luas;
    }

    double hitungKeliling(){
        keliling = alas + 2*sisiMiring;
        System.out.println("Keliling Segitiga Sama Kaki : " + keliling + "\n");
        return keliling;
    }
}
