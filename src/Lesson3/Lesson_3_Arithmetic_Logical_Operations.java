package Lesson3;

//Урок 3-Арифметические и логические операции. Операции сравнения и присваивания

public class Lesson_3_Arithmetic_Logical_Operations {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("1st " + result);//20

        int a = 5;
        int sum_a = a-- - --a + ++a + a++ + a;
        System.out.println("a " + sum_a);//14

        int b = 8;
        int sum_b = ++b - b++ + ++b - --b;
        System.out.println("b " + sum_b);//2
    }
}