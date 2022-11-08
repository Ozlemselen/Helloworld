package Interwievquestion;

import java.util.Scanner;

public class Q03_PrimeNumber {
    //kullanıcıdan pozitif bir sasyı girmesini isteyin ve asal olup olmadığını kontrol edin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı gir");
        int sayı= scan.nextInt();

        boolean flag=true;
        if(sayı>=2){
            for (int i = 2; i < sayı ; i++) {
                if(sayı%i==0){
                    flag=false;
                    break;
                }

            }
            if(flag==true)System.out.println("sayı asaldır");
            else System.out.println("sayı asal değildir");
        }
    }
}
