package modul6.latihan.MultilevelInheritance;

public class Demo {

    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        C c = new C();

        a.hitungLuas();
        b.alas = 3;
        System.out.println(b.ps);
        System.out.println(b.alas);
        c.sisiMiring = 15;
        System.out.println(c.sisiMiring);
        System.out.println(c.ps);
        System.out.println(c.pa);
        System.out.println(c.p);
        
        
        
    }
}
