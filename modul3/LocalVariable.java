package modul3;

public class LocalVariable {
    int usia;
    public void hitungUsia(){
        int usia = 0;
        int tahunSekarang = 2022;
        int tahunLahir = 2003;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya  : " + usia);
    }

    void beratBadan(){
        int beratLahir = 25;
        int beratSekarang = beratLahir + (usia /2);
        System.out.println("Berat saya : " + beratSekarang);
    }
    
    public static void main(String[] args) {
        LocalVariable foo = new LocalVariable();
        
        foo.hitungUsia();
        foo.beratBadan();
        
    }
}
