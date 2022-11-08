package j25_Encapsulation.encapsulation01;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("adını gir");
        String ad=sc.nextLine();
        System.out.println("yaşını gir");
        int yas=sc.nextInt();
        Student s1=new Student(ad,yas);
        System.out.println("student name is:" +s1.getName() + "\n He is" +s1.getAge()+"years old") ;
    }
}
class Student{//student cla screat ettim.aynı clas içine bir clas daha açabiliriz
  private  String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}