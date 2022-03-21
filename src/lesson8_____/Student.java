package lesson8_____;

import com.sun.management.VMOption;

//Урок 8 - Модификаторы «final» и «static». Понятие «константа»
public class Student {
    String name;
    int course;
    static int count; // static данная переменная принаждлежит всему классу
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student № " + count +  "   Sozdan");
    }

    public static void showCount() {
        System.out.println("Vsego sozdano studentov" + count);

    }
    public void showinfo() {
        System.out.println("Welcome to the student class!!!");

    }
    void abc() {
        a++;
    }

       public static void main(String[] args) {
//        Student St1 =new Student("ivan",1);
//        Student St2 =new Student("Maria",2);
//        Student St3 =new Student("Petr",3);
//        System.out.println(St1.name);
//        System.out.println(Student.count);
//        showCount();

    }
}


