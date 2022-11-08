package j24_AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {
      //  C01_AccessModifier obj1=new C01_AccessModifier()parametresiz erişim sağlanamadı
        C01_AccessModifier obj2=new C01_AccessModifier(7,15);//public parametreli cons.call edildi

        C02_AccessModifier semra=new C02_AccessModifier();//default parametresiz cons..;//default p'siz cons.

        System.out.println("obj2.defaultYas = " + obj2.defaultYas);//33
        obj2.protectedMethod();// protected method'dan agaya selam
        System.out.println("obj2.publicYas = " + obj2.publicYas);//48
        System.out.println("obj2.protectedYas = " + obj2.protectedYas);//40
        //obj2.privateMethod();//private method call edilemez





    }
}
