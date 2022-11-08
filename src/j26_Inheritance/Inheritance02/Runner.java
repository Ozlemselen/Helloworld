package j26_Inheritance.Inheritance02;

import j26_Inheritance.Inheritance01.Balık;
import j26_Inheritance.Inheritance01.Koyun;

public class Runner {
    public static void main(String[] args) {
        /*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
        Kedi k1 = new Kedi();
        System.out.println("k1.a = " + k1.a);
        System.out.println("k1.c = " + k1.c);
        System.out.println("k1.d = " + k1.d);
        System.out.println("k1.m = " + k1.m);

       /* Ayni isimli variable'lardan hangisinin kullanildi
        olusturulan object'in data type'ina göre bilinir
        Variable'i arastirmaya data typ
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */
        Mammal k2 = new Kedi("Kevser");//data type parent mammal clas constraktırı parametreli kedi clas
        System.out.println("k2.c = " + k2.c);//k2 objesinin data type mammal olduğu için önce mammala gider
        System.out.println("k2.a = " + k2.a);//a verıabla mammalda yok o yüzden atadan geldi
        System.out.println("k2.m = " + k2.m);
        // k2.d CTE verir.data type mammal classta d varıabla yok
        k2.mA();//e'i classindan baslanır.

        k1.mA();
        k1.mC();
        k1.mM();

        Hayvancık k3 = new Kedi();
        System.out.println("k3.m = " + k3.m);//3
        System.out.println("k3.a = " + k3.a);//0
        //   k3.c-> Datatype Hayvancık Class oldg için Class'da olmayan c variable call edilemezz
        k3.mA();// mA - > HAYVANCIK  class meth call.
        k3.mM();// mM - > Mammal  class meth call.
        Mammal m1=new Mammal('$');
        System.out.println("m1.m = " + m1.m);//1
        System.out.println("m1.a = " + m1.a);//0
        System.out.println("m1.c = " + m1.c);//4
        // m1.d-> parent Mammal Class Child Kedi Class'dan variable call edemez
        m1.mA();//Hayvancık Class call
        m1.mC();//Mammal Class call
        m1.mM();//Mammal Class call
    }
}