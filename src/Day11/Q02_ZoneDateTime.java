package Day11;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q02_ZoneDateTime {
    public static void main(String[] args) {
        //Asya/Tokyoda şu an saat kaçtır?
        ZonedDateTime tokyo=ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("tokyo = " + tokyo);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println(tokyo.format(format));

    }
}
