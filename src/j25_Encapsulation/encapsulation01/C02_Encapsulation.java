package j25_Encapsulation.encapsulation01;

public class C02_Encapsulation {//pojo class

    private String name = "Gamze";
    private int id = 1001;

    public C02_Encapsulation() {
    }

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String isimVer() {//getter metod
        return name;
    }

    public int idVer() {//getter metod
        return id;
    }
public void isimDegis(String isim){//setter değiştiren metodum
        this.name=isim;
}
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id=" + id;
    }

}






