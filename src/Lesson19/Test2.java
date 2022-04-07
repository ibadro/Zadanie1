package Lesson19;

// 019 Урок 19  Параметры метода типа varargs. Аргументы типа command line. Цикл «foreach
public class Test2 {
    static void summa(int... a) { //varargs "int... a"  должен стоять последним
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    public static void main(String[] args) {
        summa(6, 3, 5, 6, 3, 2, 2, 43, 2, 345, 234, 52345, 2345);
    }

}

class Test3 {
    static void summa(String s, int... a) { //varargs "int... a" должен стоять последним
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }

    public static void main(String[] args) {
        summa("jr", 6, 3, 5, 6, 3, 2, 2, 43, 2, 345, 234, 52345, 2345, 12342, 23);
    }

}