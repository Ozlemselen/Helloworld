package j26_Inheritance.task02;

public class SubClass extends SuperClass{
    int num=10;
  public void  my_method(){
      goster();//sub clastan geldi
      super.goster();//super clastan geldi
      System.out.println("subclas num=" + num);
      System.out.println("super.num = " + super.num);
  }

    @Override
    public void goster() {
        super.goster();
        System.out.println("Bu metod sub clasın görüntüleme metodududr");
    }
}
