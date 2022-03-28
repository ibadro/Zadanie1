
package Lesson2;

//Урок 2 - Примитивные типы данных. Понятие «переменная». Системы счисления.

public class  Lesson_2_primitive {
    public static void main(String[] args) {
        byte b1 = 0B1100; // {0,1} BIN Двоичная система счисления <<0B>>
        byte b2 = 014;// {0 - 7} OCT Восьмеричная <<0>>
        byte b3 = 12;// {0 - 9} DEC Десятичная
        byte b4 = 0XC;// {0 - F} HEX Шестнадцатеричная <<0X>>
        System.out.println(b1 + "," + b2 + "," + b3 + "," + b4);


        short s1 = 0B10100010100;
        short s2 = 02424;
        short s3 = 1_300;
        short s4 = 0X514;
        System.out.println(s1 + "," + s2 + "," + s3 + "," + s4);

        int i1 = 0B0;
        int i2 = 00;
        int i3 = 0;
        int i4 = 0X0;
        System.out.println(i1 + "," + i2 + "," + i3 + "," + i4);

        long l1 =0B111010110111100110100010101L;
        long l2 =0726746425L;
        long l3 = 123456789L;
        long l4 =0X75BCD15L;
        System.out.println(l1 + "," + l2 + "," + l3 + "," + l4);

        float f1 = 3.31F;
        float f2 = 7.7232f;
        System.out.println(f1 + "," + f2);

        double d1 = 0.43334D;
        double d2 = 9.873434;
        System.out.println(d1 + "," + d2);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 + "," + bool2);

        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 500;

        char c6 = '\u05AB';
        System.out.println(c1 + "," + c2 + "," + c3 + "," + c4 + "," + c5+ "," + c6);
    }
}