package j25_Encapsulation.encapsulation03;

public class Arac {
    /*
    1-fieldları(encapsulated) model(string),renk(string),motor(int),yıl(int) olan araç isimli class creat ediniz
    2-bütün fieldları parametre alan bir constructor tanımlayınız
    3-runner isminde main için bir class oluşturunuz
    4-iki adet parametreli constructor 1 adet parametresdiz cons.ile 3 adet araba creat ediniz
    5-araçların motor hacmi 1000cc ve altı olması ve yılını hatalı veri girişine karşı kontrol ediniz
     */
    //1.step
  private  String model;

    private String renk;
    private int motor;
    private int yıl;



    public String getModel() {
        return model;
    }

    public void setYıl(int yıl) {
        if(yıl<0){
            this.yıl=(-1)*yıl;
            System.out.println("milattan önce araba vardı da biz mi binmedik");
        }else
        this.yıl = yıl;
    }

    public int getYıl() {
        return yıl;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if(motor<1000){
            System.out.println("ağam bisiklete binseydin daha hızlı giderdin");
            this.motor=1001;
        }else
        this.motor = motor;
    }

    public Arac() {//4.step psiz const.
    }

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl +
                '}';
    }

    public Arac(String model, String renk, int motor, int yıl) {//2.step full parametreli cons.
        this.model = model;
        this.renk = renk;
       // this.motor = motor;
        setMotor(motor);//set motor call edildi
       // this.yıl = yıl;
        setYıl(yıl);//set yıl call edildi

    }









}
