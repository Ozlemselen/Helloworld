package j25_Encapsulation.encapsulation02;

public class Kisi {//pojo class
    //kisi pojo classta fields:
    // ad,soyad,password(string olmalı),yaş tüm bu fieldsları (pasword hariç)kullanıcı görebilmeli ve update edebilmeli
    //password encapsule edilmeli update edilmemeli
    //yaş variable negatif değer girmeye karşı encapsule edilmeli
    //runner clasta obj ile fieldları prınt eden cod creat ediniz

    String ad;
    String soyad;
   private int yas;
 private   String password;

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas =Math.abs(yas) ;//parametre gelen yas - den kurtuldu instance variabla atandı
    }

    public String getPassword() {
        return password;
    }


}
