package j26_Inheritance.Inheritance02;

public class Mammal extends Hayvancık {//hayvancık parent clasın child clasıdır.

    public Mammal() {//psiz cons.
        this('y');
        System.out.println("mammal çalıştı");

    }

    public Mammal(char c) {
        super(17);
        System.out.println("parametreli cons.");

    }
    public void mC(){
        System.out.println("mc mammal class metod call edildi");

    }
    int m=1;
    int c=4;

    @Override
    public void mM() {//ezen metod
        System.out.println("mM mammal clastan metod call edildi");
    }
}

