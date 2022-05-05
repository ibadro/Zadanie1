package Lesson26;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5); // автоматический процесс конвертирования примитивного типа данных в референс тип. Автобоксинг
        // long l = 50l; // автоматический процесс конвертирования.Автобоксинг
        int a = list.get(0); //anboxing. Происходит процесс анбоксинга
        System.out.println(a);
        Number b = new Integer(10);
        int c = (int) b;
        switch (c){}

        String s1 = "50";
        String s2 = "true";

        int i1 = Integer.parseInt(s1); // парсим
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(i1);
        System.out.println(b1);

    }
}
