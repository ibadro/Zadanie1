package lesson8_1;

public class Zadani2 {

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

class Test22{
    public static void main(String[] args) {
        Zadani2 z = new Zadani2();
        z.ploshad(5);
        Zadani2.dlina(7.5);
        z.info(3);
    }
}