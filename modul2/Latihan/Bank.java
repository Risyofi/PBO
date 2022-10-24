package modul2.Latihan;


public class Bank {
    double saldo;
    int no_rekening = 200210021;
   
    void check_saldo(){
        System.out.println(
        "No rekening : "  + no_rekening + "\n" +  
        "\t" +"Saldo anda  : Rp. " + saldo + "\n" + 
        "---------------------------------------------" );
        
    }

    void menabung(int value){
        double Value = value;
        saldo = saldo + value;
        System.out.println(
        "No rekening : "  + no_rekening + "\n" +
        "\t" +"Menabung    : Rp. " + Value + "\n" +  
        "\t" +"Saldo anda  : Rp. " + saldo + "\n" + 
        "---------------------------------------------");

    }

    void menarik(int value){
        double Value = value;
        saldo = saldo - value;
        System.out.println(
        "No rekening : "  + no_rekening + "\n" +
        "\t" +"Menarik     : Rp. " + Value + "\n" +  
        "\t" +"Saldo anda  : Rp. " + saldo + "\n" + 
        "---------------------------------------------");
    }

    void transfer(int value){
        double Value = value;
        saldo = saldo - value;
        System.out.println(
        "No rekening : "  + no_rekening + "\n" +
        "\t" +"Selamat Transfer anda sudah dikirim sebesar Rp. " + Value + "\n" + 
        "\t" +"Saldo anda  : Rp. " + saldo + "\n" + 
        "---------------------------------------------");
    }

    public static void main(String[] args) {
        Bank client = new Bank();

        client.check_saldo();
        client.menabung(100000);
        client.menarik(20000);
        client.transfer(10000);
        
    }
}
