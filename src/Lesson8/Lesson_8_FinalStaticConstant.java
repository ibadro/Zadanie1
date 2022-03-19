package Lesson8;

//Урок 8 - Модификаторы «final» и «static». Понятие «константа»

public class Lesson_8_FinalStaticConstant {

    static double multiply(double a, double b, double c){
        return a * b * c;
    }

    static void divide(int a, int b) {
        System.out.println("Целое частное = "+ a/b + ". Остаток = " + a%b);
    }
}
class Lesson8Test{
    public static void main(String[] args) {
        System.out.println(Lesson_8_FinalStaticConstant.multiply(2,3,4));
        Lesson_8_FinalStaticConstant.divide(9,2);
        System.out.println(Lesson_8_FinalStaticConstant.multiply(2.5,3.5,4));
        Lesson_8_FinalStaticConstant.divide(15,4);
    }
}

class Task2{

    public final static double PI = 3.14;

    public double ploshad(double radius) {
        double p1 = PI * radius * radius;
        return p1;
    }

    public static double dlina(double radius2) {
        double d1 = 2 * PI * radius2;
        return d1;
    }
    public void info(double radius3){
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь круга = " + ploshad(radius3));
        System.out.println("Длина окружности = " + dlina(radius3));
    }
}

class Task2Test{
    public static void main(String[] args) {
        Task2 z = new Task2();
        z.ploshad(5);
        Task2.dlina(7.5);
        z.info(3);
    }
}