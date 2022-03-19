

/*Напишите программу, в которой будет создано 8 объектов,
  но к последней строке метода main останется всего 2.*/

public class Homework1 {
    public static void abc() {
        String s1 = new String("ABC");
        String s2 = new String("DEF");
    }

    public static void main(String[] args) {
        Homework1 l9 = new Homework1();
        abc();
        abc();
        String s1 = new String("ABC");
        abc();
    }
}