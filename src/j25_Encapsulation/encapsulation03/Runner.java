package j25_Encapsulation.encapsulation03;

public class Runner {
    public static void main(String[] args) {
        //4.step

        Arac honda=new Arac("accord","siyah",-200,2012);
        Arac volvo=new Arac("s80","beyaz",2000,-2015);
        Arac hacimurat=new Arac();
        hacimurat.setModel("serce");
        hacimurat.setRenk("sarı");
        hacimurat.setMotor(1300);
        System.out.println("honda = " + honda);
        System.out.println("hacimurat = " + hacimurat);
        System.out.println("volvo = " + volvo);
    }
}
