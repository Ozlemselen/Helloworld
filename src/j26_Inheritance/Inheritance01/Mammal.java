package j26_Inheritance.Inheritance01;

public class Mammal extends Hayvancık{//hayvancık parent clasın child clasıdır.
    public Mammal() {//psiz cons.
        System.out.println("mammal çalıştı");

    }
    public void sutbeslenme(){
        System.out.println("bebeleri süt ile beslenir");
    }
    public void dogum(){
        System.out.println("bebesini doğurup analık eder");

    }

}
