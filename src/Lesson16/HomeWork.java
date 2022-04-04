package Lesson16;
//  Создайте клавсс, в котором создайте методй емайл. Данный метод должен принимать в инпут 1 String параметр.
//  Данный парпметр должен содеражать в себе емейлы в следующем виде ya@yahoo.com; ona@gmail.com;  т е
// полсе каждого  емайл должен стоять знак препинания ";" Ваш метод должен выводить на экран информацию о том, какой
// почтой пользуются, исходя из параметра , те оутпут должен быть следующего вида:
// yahoo
//mail
//gmail
//Продемонстрируйте метод
public class HomeWork {
    public void email(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }

        }
        public static void main (String[] args) {
            HomeWork l16 = new HomeWork();
            l16.email("lkjlk@yahoo.com; qwwer@gmail.com;  sf@gmail.com");

        }

    }


