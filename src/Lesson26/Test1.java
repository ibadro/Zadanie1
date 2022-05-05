package Lesson26;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red","v4");
        Car c2 = new Car("red","v4");
        Car c3 = new Car("black","v8");
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c2));

    }
}
class  Car {
    String color;
    String engine;
    Car(String color, String engine){
        this.color=color;
        this.engine=engine;
    }
    public boolean equals(Object obj) { // перезаписываем мотод equals
        if(obj instanceof Car) { // сравниваю цвет текущего обькта с  Object obj
            Car c2 = (Car) obj; // кастинг
            return (color.equals(c2.color) && engine.equals(c2.engine)); // сравниваю цвеf и engine
        }else {
            return false;
        }
    }
}