package lesson8_____;
//Урок 8 - Модификаторы «final» и «static». Понятие «константа»
public class Car {
    String color = "blue";
    String engine = "V6";
}
    class Human {
        String name = "ivan";
        final Car c = new Car();
        public static void main(String[] args) {
            Human h1 = new Human ();
            h1.c.engine= "V8";
        }
     }

