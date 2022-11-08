package j25_Encapsulation;

public class C02_Encapsulation {

    private String name = "gamze";

    public C02_Encapsulation() {
    }

    private int id = 1001;

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id=" + id;


    }
}
