public class SegiTigaSamaSisi extends SegiTiga{
    double sisi;

    double hitungTinggi(){
        alas = sisi; // Karena segitiga sama sisi, jadi semua sisinya sama. sehingga alas sama dengan sisi.
        double a = alas / 2;
        double b = Math.pow(a, 2);
        double c = Math.pow(sisi,2);
        double d = c - b;
        double tinggi = Math.sqrt(d);
        return tinggi;
    }

    double hitungLuas(){
        alas = sisi;
        luas = (hitungTinggi() * alas)/2;
        System.out.println("Luas Segitiga Sama Sisi : " + luas);
        return luas;
    }

    double hitungKeliling(){
        keliling = 3 * sisi;
        System.out.println("Keliling Segitiga Sama Sisi : " + keliling);
        return keliling;
    }
    
}
