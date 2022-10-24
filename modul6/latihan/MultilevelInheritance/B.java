package modul6.latihan.MultilevelInheritance;

public class B extends A{
    double alas;
    int pangkat = 2;
    double ps = Math.pow(alas, pangkat);
    public void MessageB(){
        System.out.println("Info dari Class B");
    }
}
