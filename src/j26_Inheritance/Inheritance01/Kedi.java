package j26_Inheritance.Inheritance01;

public class Kedi extends Mammal{//mammal parent clas childı-torun
//Child class obje olmadan parent clas özelliklerine variable metodlara ulaşabilir.
    public Kedi() {
        System.out.println("kedi psiz cons.çalıştı");

    }
    public void cırmala(){
        System.out.println("kedi fena tırmalar");
    }
}
