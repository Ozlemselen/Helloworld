package j26_Inheritance.task02;

public class SuperClass {
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.my_method();
    }
    int num=20;
    public  void goster(){
        System.out.println("Bu method süper classın görüntülenme methodudur");

    }
}
