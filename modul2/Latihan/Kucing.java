package modul2.Latihan;

public class Kucing {
    int umur;
    String warnaBulu = "Hitam";

    public void Umur(int value){
        umur = value;
    }

    void meong(){
        System.out.println(
            "Miiiaaawwwww...\n" +
            "Umur       : " + umur + "\n" +
            "Warna Bulu : " + warnaBulu  
        );   
    }
    public static void main(String[] args) {
        Kucing kucing = new Kucing();

        kucing.Umur(2);
        kucing.meong();
    }
}

