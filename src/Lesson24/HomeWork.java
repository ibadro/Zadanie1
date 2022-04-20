package Lesson24;

public class HomeWork {
    public static void main(String[] args) {
        Meshenosec m = new Meshenosec("Karl");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();
        Speakable s1 = new Pnigvin("Dudun");
        s1.speak();
        Animal1 a = new Lev("Leva");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal mam = new Lev("Leva2");
        System.out.println(mam.name);
        mam.eat();
        mam.speak();
        mam.sleep();
        mam.run();
    }
}
abstract class Animal1 {
    Animal1(String name) {
        this.name = name;
    }
    String name;
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal1 {
    Fish(String name) {
        super(name);
        this.name = name;
    }
    public void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }
    abstract void swim();
}
abstract class Bird extends Animal1 implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }
    abstract void fly();
    public void speak() {
        System.out.println(name + " sings");
    }
}
abstract class Mammal extends Animal1 implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}
interface Speakable {
    default void speak() {
        System.out.println("somebody speaks");
    }
}
class Meshenosec extends Fish {
    Meshenosec(String name) {
        super(name);
        this.name = name;
    }
    public void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает!");
    } void eat() {
        System.out.println("Меченосец  не хищная рыба, и она есть обычный рыбий корм!");
    }
}
class Pnigvin extends Bird {
    Pnigvin(String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Пингвин любит есть рыбу!");
    }
    public void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу!");
    }
    public void fly() {
        System.out.println("Пингвины сне умеют летать!");
    }
    public void speak() {
        System.out.println("Пингвины  не умеют петь как соловьи!");
    }
}
class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Лев любит мясо!");
    }
    public void sleep() {
        System.out.println("Лев много спит");
    }
    public void run() {
        System.out.println("Лев не самый быстрый");
    }
}
/**/