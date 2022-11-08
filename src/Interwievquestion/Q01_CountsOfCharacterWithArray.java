package Interwievquestion;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharacterWithArray {
    //kullanıcıdan bir string alınız
    //stringde var olan her characterin sayıosını yazdırınız
    //örn: alacan=a=3,l=1,c=1,n=1
    //   abaa = a=3 b=1

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = scan.nextLine();
        String[] arr = str.split("");//her bir klarakteri ayırır
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // count sayaç oluştur
        int counter = 0;
        //karakterleri karşılaştırmak için for loop

        for (int i = 0; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;

            } else {
                System.out.println(arr[i - 1] + "sayısı" + (counter + 1));
                counter = 0;
            }
            if (i == arr.length - 1) {//en son karakter için çalışır
                System.out.println(arr[i]+"sayısı"+(counter+1));

            }
        }
    }
}