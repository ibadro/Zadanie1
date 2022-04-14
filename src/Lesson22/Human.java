package Lesson22;

public class Human {
    public String name = "ilnur";
    public static int salary = 150;

    public void work() {
        System.out.println("rabotat");
    }

    public static void rest() {
        System.out.println("otdihat");

    }
}
class Student extends Human{ // все public  элементы классса  наследуются классом  студент где бы он не находился
    public static void main(String[] args) {
        Student s =new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }

}
