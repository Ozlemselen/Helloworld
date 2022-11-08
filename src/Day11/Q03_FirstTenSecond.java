package Day11;

import java.time.LocalDateTime;

public class Q03_FirstTenSecond {
    public static void main(String[] args) {
        //local tıme ile her dakikanın ilk 10 saniyesini bulma

        LocalDateTime time=LocalDateTime.now();
        System.out.println("time = " + time);
        if(time.getSecond()<=10)
            System.out.println("ilk on saniye içinde");
        else
            System.out.println("ilk on saniye dışında");
    }
}
