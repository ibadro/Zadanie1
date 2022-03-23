package Lesson11.Homework;
 /*Создайте класс Cat с тремя переменными; цвет, мотор и количество дверей. Затем создайте класс CarTest, в котором должны быть 2 метода.
1-ый изменяет количество дверей объекта класса Car на количество, прописанное в параметре метода.
2-ой принимает в параметры 2 объекта класса Car и меняет их цвета местами.
Примените оба метода в main и выведите на экран атрибуты всех объектов.*/

public class Car {
    String color;
    String engine;
    int doorsCount;

    public Car(String color, String engine, int doorsCount) {
        this.color = color;
        this.engine = engine;
        this.doorsCount = doorsCount;
    }
}

class CarTest {

    void changeDoors(Car c, int doorsCount) { // метод изменяет количество дверей на кол-во прописанных в параметре
        c.doorsCount = doorsCount;
    }

    void changeColor(Car c1, Car c2) { // принимает в параметры 2 объекта класса Car и меняет их цвета местами
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) { // Примените оба метода в main и выведите на экран атрибуты всех объектов
        CarTest ct = new CarTest();                                              // создается обьект класса картест
        Car car1 = new Car("red", "V4", 2);
        Car car2 = new Car("yellow", "V6", 4);
        ct.changeDoors(car1, 3); // меняется кол-во дверей
        ct.changeColor(car1, car2); // меняется местами цвета
        System.out.println("Информация о первой машине:   Цвет: " + car1.color + "  Мотор: " + car1.engine +
                " Количество дверей:  " + car1.doorsCount);
        System.out.println("Информация о второй машине:   Цвет: " + car2.color + "  Мотор: " + car2.engine +
                " Количество дверей:  " + car2.doorsCount);
    }
}
