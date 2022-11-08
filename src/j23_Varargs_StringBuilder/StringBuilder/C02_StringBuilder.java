package j23_Varargs_StringBuilder.StringBuilder;

import java.util.Locale;

public class   C02_StringBuilder {

    public static void main(String[] args) {

        // StringBuilder obj create etme...
        // 1. yol
        StringBuilder sb1=new StringBuilder();// default capacity 16 bit olan value'su olmayan  bos sb

        System.out.println("sb1.length() = " + sb1.length());//0 -> length(): sb 'deki karakter sayısı return eder

        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append("jAVATAR");//javatar sb1' eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append(" selam ").append("olsun").append(" ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1);// jAVATAR selam olsun24true
        System.out.println("sb1.capacity() = " + sb1.capacity());//34

        sb1.append(" basarı gayrete asıktır :)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//70
//2.yol
        StringBuilder sb2=new StringBuilder("fatih beye selamlar");//ilk değer ataması yapılmış sb objesi
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());

        //trim metodu : fazladan ayrılan capasity silinir

        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());
//3.yol
        StringBuilder sb3=new StringBuilder(11);//hafızada 11 karakterlik yer ayıran boş sb tanımlandı
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());
        sb3.append("özlemçalık");
        System.out.println("sb3.capacity() = " + sb3.capacity());

        //istenen bir karakter indexi alma

        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));

        //belirli bir aralıktaki karakterleri alma

        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));//3,4,5,6,7,8,9,10,11,12 indexe kadar
        System.out.println("sb1.substring(17) = " + sb1.substring(17));//17 ve sona kadar tüm karakterleri verir
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));

//belirli bir ındexteki karakteri silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));//3. indexi sildi
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));//3 ten 6ya kadar sildi

        //istenen karakterleri eklemek

        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,:)) = " + sb3.insert(4, ":)"));
        String  s="güzel insan";
        //  System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));//eel ibub:)ekir bey->sb3 value!sini 1. index'ine s value'sinin 3,7 index eklendi

        StringBuilder sb4=new StringBuilder("Nihan Hanım");
        System.out.println("sb4.insert(5,\"Qa team lead\",0,2) = " + sb4.insert(5, "Qa team lead", 0, 2));//NihanQa Hanım

        //istenen index'deki karakteri değiştirme..
        sb4.setCharAt(6,'A');
        sb4.setCharAt(sb4.indexOf(" "),':');
        System.out.println("sb4 = " + sb4);//NihanQA Hanım
        System.out.println("sb4.insert(6,\" \") = " + sb4.insert(5, " "));

        //istenen index'e karakter yerine birden cok karakter eklemek

        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

        //Sb obj String'e çevirme-> toString()

        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());//EEL İBUB:)EKİR BEY->sb3 SB stringe cevirelerek toUppercase meth calıştı

//Sb objeyi stringe çevirme: tostring
        System.out.println("sb3.toString().toUpperCase(Locale.ROOT) = " + sb3.toString().toUpperCase(Locale.ROOT));
        //büyük harf yapmak için string builderı tostring metoduyla stringe çeviririz

       //String ile StringBuilder karsilastirmasi


/*
Compare iki sb'i esit mi diye kontrol etmek icin
ilk harften baslayarak tum karakterleri karsilastirir
Ayni olan karakterler icin bir sey return etmezken
farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
oldugunu print eder
Tamamen ayni ise bize 0 return eder

bir sb ile bir String'i compare etmek istersek Java CTE verir
 */


StringBuilder sb5=new StringBuilder("javaCan");
StringBuilder sb6=new StringBuilder("javaCan");
String str1="javaCan";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));

        System.out.println("sb5.equals(sb6) = " + sb5.equals(sb6));//hem value hem referans değerine bakar.false verir
//socrative
StringBuilder strB1=new StringBuilder("AVATAR");
strB1.subSequence(1,5);
strB1.reverse();
strB1.deleteCharAt(2);
        System.out.println("strB1 = " + strB1);

    }
}
