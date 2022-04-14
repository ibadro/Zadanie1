package Lesson22;

import java.util.SortedMap;

/*
Создайте класс Анимал. Прие вызове его конструктора пусть на экран выводится "I am animal". В классе пусть будет переменная eyes, характерихующая колличество глаз;
методы eat(выводящий на экран "Animals Eats" и drink (выводящий на экран "animal drinks").
Создайте класс Pet?, который является child классом класса Animal. При вызове его конструктора пусть на жкран выводится "I am pet"  ии перменной eyes придается значение 2.
В классе пусть булет переменных name, Tail, характеризующая количество хвостов и равная 1; paw, характеризующая количество лап и равная 4;
методы run( выводящий на экран "Pet runs") b jump (выводящий на экран "Pet jumps").
Создайте класс Dog который является child классом Pet. При вызове его конструктора с параметрам, который будет передавать имя, пусть на экран
выводится "I am dog and my name is:"+ имя питомца. В классе добавьте метод play (выводящий на экран "Dog plays")
Создайте класс Cat который является child классом Pet. При вызове его конструктора с параметрам, который будет передавать имя, пусть на экран
выводится "I am cat and my name is:"+ имя питомца. В классе добавьте метод sleep (выводящий на экран "Cat sleeps")
Сщздайте класс Test, в методе main которого вывидите на экран количество лап обьекта класса Dog и вызовите sleep оббьекта класса Cat.
 */
public class Animal {
    public Animal(){
        System.out.println("I am animal");
    }
    int eyes;
    public void eat(){
        System.out.println("Animal Eats");
    }
    public void drink() {
        System.out.println("Animal drinks");
    }
}
class Pet extends Animal {
    Pet ()  {
        System.out.println("I am pet");
        eyes=2;
    }
    String name;
    int tail=1;
    int paw =4;

    public void run(){
        System.out.println("Pet runs");
    }
    public void jump(){
        System.out.println("Pet jumps");
    }
}
class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is:" + name);
    }
}
class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is:" + name);
    }
    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
class Test2 {
    public static void main(String[] args) {
        Dog d = new Dog("Шарик");
        System.out.println("Количество лап у собаки   " + d.paw);
        Cat c = new Cat("Murka");
        c.sleep();

    }
}
