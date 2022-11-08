package Interwievquestion;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    //Kullanıcıdan alınan bir stringin ilk ve son harfini yine kullanıcıdan alınan sayı kadar return eden metod yazın

    //örn: elma 2         eaea
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = scan.nextLine();
        System.out.print("bir sayı giriniz");
        int sayi = scan.nextInt();
        System.out.println(ilkSonHarf(str, sayi));
    }
    private static String ilkSonHarf(String str, int sayi) {
        String ilkSonHarfler = str.substring(0,1) + str.substring(str.length()-1);
        System.out.println("ilkSonHarfler = " + ilkSonHarfler);
        String output ="";
        for (int i = 0; i < sayi; i++) { //birlesimden kac tane yazdiracaksam onu verir
            output+= ilkSonHarfler;
        }
        return output;
    }
}






