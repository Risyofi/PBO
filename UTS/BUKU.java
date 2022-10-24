package UTS;

public class BUKU {
    public String judul;
    public String pengarang;
    public int tahun, jumlah;

    void beriJudul(String judul){
        this.judul = judul;
    }

    void beriPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    void beriTahun(int tahun){
        this.tahun = tahun;
    }

    void beriJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public void printInfo(){
        System.out.println(
            "Judul     : " + judul + "\n" +
            "Pengarang : " + pengarang + "\n" +
            "Tahun     : " + tahun + "\n" +
            "Tersedia  : " + jumlah + "\n"
        );
    }

}
