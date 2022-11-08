package j26_Inheritance.Inheritance02;

public class Hayvancık {//g.parent super class

    public Hayvancık() {//psiz const.
        System.out.println("ağam HAYVANCIK parametresiz const..");

    }

    public Hayvancık(int i){
        System.out.println("HAYVANCIK parametreli const.");

    }
    public void mA(){
        System.out.println("HAYVANCIK class metod call");

    }
    public void mM() {
        System.out.println("HAYVANCIK clas metod call");
    }

    int a;
    int m=3;
}