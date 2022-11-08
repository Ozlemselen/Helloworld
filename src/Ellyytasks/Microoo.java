package Ellyytasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Microoo {
    //bir tamsasyı listesinde en yakın 2 tam sayıyı bulunuz.
    //örn:(12,31,15,32,54) =çıktı 31 32
    //listedeki 8 ve 12 dışındaki her öğenin değerini 2şer artırın.
    //örn:(15,31,8,13,12) =çıktı (17,33,8,15,12)

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(12,31,15,32,54));
        Collections.sort(list);
        System.out.println(list);



        //2.soru
        ArrayList<Integer>sayi= new ArrayList<>(List.of(15, 31, 8, 13, 12));
        for (int i = 0; i < sayi.size(); i++) {
            if (sayi.get(i)!=8 && sayi.get(i)!=12){
                sayi.set(i,sayi.get(i)+2);
            }
        }System.out.println(sayi);





























    }
}
