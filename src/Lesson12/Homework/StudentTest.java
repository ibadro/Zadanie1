package Lesson12.Homework;
import Lesson11.Student;

/* В классе StudentTest написать 2 метода, которые принимают 2 input параметра - 2 объекта класса Student из Lеsson11.
Первый метод сравнивает 2-х студентов, используя 1 if statement и логические операторы внутри него и выводит на экран информацию о том, равны ли студенты.
Второй метод использует пеяед nested if statement, сравнивает все атрибуты студента по отдельности, выводит на экран информацию о том, равны ли студенты,
 а если не равны, то в чём именно было обнаруженно первое неравенство.*/

public class StudentTest {
     public static void method1(Student st1, Student st2) {
         if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st1.grade) {
             System.out.println("СТцденты одинаковы");
         } else {
             System.out.println("Студенты разные");
         }
         }

    public static void method2 (Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена студентов, курсы и оценки одинаковые");
                } else {
                    System.out.println("имена студ и курс один, но оценки разл");
                }
            } else {
                System.out.println("Имена студ один, но курсы разные");
            }
        } else {
            System.out.println("имена студ различ");
        }
    }

    public static void main(String[] args) {
        Student s1 =new Student( "ivan",2, 6.6);
        Student s2 =new Student( "durac",2, 5.6);
        method1(s1,s2);
        method1(s1,s2);
    }
}
