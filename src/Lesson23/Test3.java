package Lesson23;

import javax.swing.text.EditorKit;

public class Test3 {
    public static void main(String[] args) {
        Employеe1 e = new Employеe1();
        Teacher t = new Teacher();
        t.eat();
        e.eat();
    }
}
class  Eda{}
class Frukti extends Eda{}

    class Employеe1{
        double salary=100;
        String name;
        int age;
        int experience;

        Eda eat () {
            System.out.println("kushat rabothik"); // overraided method
            Eda e =new Eda();
            return e;
        }
        void sleep () {        System.out.println("spat");    }
    }
    class  Teacher  extends Employеe1 {
        Eda eat() {
            System.out.println("kushat ushitel"); // overraided method
            Eda e = new Eda();
            return e;
        }
        int kolichestvoushenikov;
       void ushit() {
            System.out.println("Ushit");
        }
  }
