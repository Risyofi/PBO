package modul6.latihan.MultilevelInheritance;

public class C extends B{
    double sisiMiring;
    double pa =  Math.pow(sisiMiring, 2);
    double ps = Math.pow(alas,3);
    double p = Math.pow(sisiMiring, 2)-Math.pow(alas,2);
    public void MessageC() {
        System.out.println("Info dari Class C");
    }
}
