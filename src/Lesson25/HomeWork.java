package Lesson25;
/* Переименуйте класс lesson 24 из последнего дз в lesson25 и измените его метод Main сделдующим образом. Создайте
* в нем 2 массива Speakable и типа Animal, которые будут содержать все возможные ссылочные переменные, ссылающиеся на все возможные обьекты.
* Используя if и Instanceof  проверяйте на какой обьетк ссылаеттся переменная и выводите на экран  соотв. переменные данного
* обьекта и вызывайте его методы*/
public class HomeWork {
    public static void main(String[] args) {
        Meshenosec2 m = new Meshenosec2("Karl");
        System.out.println(m.name2);
        m.eat2();
        m.sleep2();
        m.swim2();
        Speakable2 s1 = new Pnigvin2("Dudun");
        s1.speak2();
         Animal2 a = new Lev2("Leva");
        System.out.println(a.name2);
        a.eat2();
        a.sleep2();
        Mammal2 mam = new Lev2("Leva2");
        System.out.println(mam.name2);
        mam.eat2();
        mam.speak2();
        mam.sleep2();
        mam.run2();
    }
}
abstract class Animal2 {
    Animal2(String name2) {
        this.name2 = name2;
    }
    String name2;
    abstract void eat2();
    abstract void sleep2();
}
abstract class Fish2 extends  Animal2 {
    Fish2(String name2) {
        super(name2);
        this.name2 = name2;
    }
    public void sleep2() {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }
    abstract void swim2();
}
abstract class Bird2 extends  Animal2 implements Speakable2 {
    Bird2(String name2) {
        super(name2);
        this.name2 = name2;
    }
    abstract void fly2();
    public void speak2() {
        System.out.println(name2 + " sings");
    }
}
abstract class Mammal2 extends Animal2 implements  Speakable2 {
    Mammal2(String name2) {
        super(name2);
        this.name2 = name2;
    }
    abstract void run2();
}
interface Speakable2 {
    default void speak2() {
        System.out.println("somebody speaks");
    }
}
class Meshenosec2 extends Fish2 {
    Meshenosec2(String name) {
        super(name);
        this.name2 = name2;
    }
    public void swim2() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает!");
    }
    void eat2() {
        System.out.println("Меченосец  не хищная рыба, и она есть обычный рыбий корм!");
    }
}
class Pnigvin2 extends Bird2 {
    Pnigvin2(String name2) {
        super(name2);
        this.name2 = name2;
    }
    public void eat2() {
        System.out.println("Пингвин любит есть рыбу!");
    }
    public void sleep2() {
        System.out.println("Пингвины спят прижавшись друг к другу!");
    }
    public void fly2() {
        System.out.println("Пингвины сне умеют летать!");
    }
    public void speak2() {
        System.out.println("Пингвины  не умеют петь как соловьи!");
    }
}
class Lev2 extends  Mammal2 {
    Lev2(String name2) {
        super(name2);
        this.name2 = name2;
    }
    public void eat2() {
        System.out.println("Лев любит мясо!");
    }
    public void sleep2() {
        System.out.println("Лев много спит");
    }
    public void run2() {
        System.out.println("Лев не самый быстрый");
    }
}