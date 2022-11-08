package Day11;

public class Q05_Varargs01 {
    public static void main(String[] args) {
        //istediğimiz kadar sayı girdiğimizde toplamlarını bize veren bir method yazın

        topla(5, 6, 9, -5, 45, 258, -125);

    }

    private static void topla(int... sayi) {
        int topla=0;

        for (int each :sayi) {
            topla+= each;
        }
        System.out.println("toplam = " + topla);
    }
}



