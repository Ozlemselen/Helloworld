package Day11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Q01_LocalDate {
    public static void main(String[] args) {
        //bugünün tarihini alınız yazdırınız
        //daha sonra 1 gün,1 ay ve 1 yıl ekleyerek değişen tarihi yazdırın.
        //değişen tarih üzerinden 3 gün,2 ay,5 yıl eksilterek son tarihini yazdırınız
        LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun);
        LocalDate degisenTarih = bugun.plusDays(1).plusMonths(1).plusYears(1);
        System.out.println("degisenTarih = " + degisenTarih);
        LocalDate sonTarih = degisenTarih.minusDays(3).minusMonths(2).minusYears(5);
        System.out.println("sonTarih = " + sonTarih);

    }
}


