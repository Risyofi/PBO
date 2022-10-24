package modul2.Latihan;

public class BankDemo {
    public static void main(String[] args) {
        Bank client = new Bank();

        client.check_saldo();
        client.menabung(100000);
        client.menarik(20000);
        client.transfer(10000);
        
    }
}
