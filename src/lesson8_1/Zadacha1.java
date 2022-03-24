package lesson8_1;

//  В первом кклассе создайте 2 static метода. 1ый пусто умножает число из парамтрев ввода и возвращает их проиведение 2ой - делит первое число на второе и нечего не возвращает,
// лишь выводит дисплей в читабельном виде целое число и остаток. Во втором классе дважды используйте данные методы.
public class Zadacha1 {
    static double umnojenie(double a, double b, double c) {
        return a * b * c;
    }

    static void delenie(int a, int b) {
        System.out.println("Целое частное = " + a / b + ". Остаток = " + a % b);
    }
}

class Zadacha1Test {

    public static void main(String[] args) {
        System.out.println(Zadacha1.umnojenie(2, 23., 3));
        System.out.println(Zadacha1.umnojenie(2, 26., 1232));
        Zadacha1.delenie(10, 5);
        Zadacha1.delenie(333, 232);
    }
}