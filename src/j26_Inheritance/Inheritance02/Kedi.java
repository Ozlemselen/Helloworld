package j26_Inheritance.Inheritance02;

public class Kedi extends Mammal {//mammal parent clas childı-torun
//Child class obje olmadan parent clas özelliklerine variable metodlara ulaşabilir.
    public Kedi() {
        super();
        System.out.println("kedi psiz cons.çalıştı");

    }
    public Kedi(String str) {
        this();
        System.out.println(super.c);
        System.out.println("parametreli cons.");
    }

        public void cırmala(){
        System.out.println("kedi fena tırmalar");
    }

    int c=2;
    int d=5;

    @Override
    public void mC() {//mammal parentten ezen metod
        System.out.println(" mC kedi clastan call edildi");
    }
}
