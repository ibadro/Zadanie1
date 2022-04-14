package Lesson22;
//Наследование
public class Test3 {
    public static void main(String[] args) { // обьект класса Doctor doc Обращается\общается\ использует переменные и методы в классе employee так как будто они указаны в его теле- принцип наследования
        Doctor doc= new Doctor();
        doc.name= "ivan";
        doc.age=50;
        doc.experience=25;
        doc.eat();
        doc.specializasya ="hirurg";
        doc.sleep();
        doc.leshit();
        }
    }
class Employеe{
    String name;
    int age;
    int experience;
    void eat () {        System.out.println("kushat");    }
    void sleep () {        System.out.println("spat");    }
}
class Doctor extends Employеe { // то что общее для всех применяем наследование и выводим общие параметры в класс employеe - их родительский класс и добавляем "extends Employеe" для каждого работника
//    String name;
//    int age;
//    int experience;
    String specializasya;
//    void eat() {        System.out.println("kushat");    }
//    void sleep () {        System.out.println("spat");    }
    void leshit () {        System.out.println("Leshit");    }
}
class  Tesasher extends Employеe {
//    String name;
//    int age;
//    int experience;
    int kolichestvoushenikov;
//    void eat () {        System.out.println("kushat");    }
//    void sleep () {        System.out.println("spat");    }
    void ushit () {        System.out.println("Ushit");    }
}
class Driver extends Employеe {
//    String name;
//    int age;
//    int experience;
    String nazvaniemashini;
//    void eat () {        System.out.println("kushat");    }
//    void sleep () {        System.out.println("spat");    }
    void vodit() {        System.out.println("Vodit");    }
}