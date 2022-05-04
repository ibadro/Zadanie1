package Lesson25;
/* Переименуйте класс lesson 24 из последнего дз в lesson25 и измените его метод Main сделдующим образом. Создайте
* в нем 2 массива Speakable и типа Animal, которые будут содержать все возможные ссылочные переменные, ссылающиеся на все возможные обьекты.
* Используя if и Instanceof  проверяйте на какой обьетк ссылаеттся переменная и выводите на экран  соотв. переменные данного
* обьекта и вызывайте его методы*/
public class HomeWork {
    public static void main(String[] args) {
        Animal2 a1 = new Meshenosec2("Karl2_1");
        Animal2 a2 = new Pnigvin2("Dudin2_1");
        Animal2 a3 = new Lev2("Leva2_1");
        Fish2 f1 = new Meshenosec2("Karl2_2");
        Bird2 b1 = new Pnigvin2("Dudin2_2");
        Mammal2 m1 = new Lev2("Leva2_2");
        Meshenosec2 mesh1 = new Meshenosec2("Karl2_2") ;
        Pnigvin2 p1 = new Pnigvin2("Dudin2_3");
        Lev2 l1 = new Lev2("Leva2_3");
        Speakable2 s1 = new Pnigvin2("Dudin2_4");
        Speakable2 s2 = new Lev2("Leva2_4");
        Animal2[] array1 = {a1, a2, a3, f1, b1, m1, mesh1, p1, l1};
        Speakable2[] array2 = {s1, s2, b1, m1, p1, l1};
        for (Animal2 a : array1) {
            if (a instanceof Meshenosec2) {
                Meshenosec2 m = (Meshenosec2) a;
                System.out.println(m.name2);
                m.eat2();
                m.sleep2();
                m.swim2();
            } else if (a instanceof Pnigvin2) {
                Pnigvin2 p = (Pnigvin2) a;
                System.out.println(p.name2);
                p.eat2();
                p.sleep2();
                p.fly2();
                p.speak2();
            } else if (a instanceof Lev2) {
                Lev2 l = (Lev2) a;
                System.out.println(l.name2);
                l.eat2();
                l.sleep2();
                l.run2();
                l.speak2();
            }
            System.out.println("---------------------------------");
        }
        for (Speakable2 s : array2) {
            if (s instanceof Pnigvin2) {
            Pnigvin2 p = (Pnigvin2) s;
            System.out.println(p.name2);
            p.eat2();
            p.sleep2();
            p.fly2();
            p.speak2();
        } else if (s instanceof Lev2) {
            Lev2 l = (Lev2) s;
            System.out.println(l.name2);
            l.eat2();
            l.sleep2();
            l.run2();
            l.speak2();
        }
        System.out.println("---------------------------------");
    }
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