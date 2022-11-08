package Interwievquestion;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    public static void main(String[] args) {
        //String olan pin kodunuzu kontrol eden bir kod yazınız

        String pin = "sumeyra12345";
        int girisHakki = 4;
        Scanner scan = new Scanner(System.in);
        System.out.println("*** hoşgeldiniz***");

        while (true) {

            System.out.println("pin kodu giriniz");
            String girilenpin = scan.nextLine();
if(pin.equals(girilenpin)){
    System.out.println("başarılı giriş yaptınız");
    break;
}else{
    System.out.println("yanlış giriş yaptınız");
    girisHakki--;
    System.out.println("kalan giriş hakkınız"+ girisHakki);
}if(girisHakki==0){
                System.out.println("giriş hakkınız kalmadı sim kartınız bloke oldu");
                break;
            }

        }
    }
}