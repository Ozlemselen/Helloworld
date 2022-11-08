package Day11.prıntf;

public class C01_TemelBilgiler {
    //https://www.digitalocean.com/community/tutorials/java-printf-method
    public static void main(String[] args) {
        int sayi = 753;
        String str = "Bootcamp Clarusway";
        double db = 3.89563056;
        System.out.println(sayi + " -" +str+" - "+db);

        System.out.printf("sayi :%d,str :%s,db :%f\n",sayi,str,db);
        System.out.printf("sayi :%d,str :%S,db :%f\n",sayi,str,db);
        System.out.printf("sayi:%10d,str %-10.10S,db :%-5.3f\n",sayi,str,db);//%10d 10 hanelik kapasite ayırır
        //%-10.10S sola yaslayarak 10 birimlik kapasite ver ve string ifadeyi büyük harfle 10 karakterini yazdır
        //%-5,3f sola yaslayarak 5 birimlik  kapasite ver.virgülden sonra 3 hane yazdır
        // - sola yaslar
        System.out.printf("sayi : %-10d,str : %-8.8s ,db :%07.4f",sayi,str,db);





    }
}

