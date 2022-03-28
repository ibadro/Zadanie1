package Lesson3;

public class Test6 {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(!b);
    }
}

class kajslkjlkj {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 0;
        int d = 100;
        boolean e = a < b && c == d; // true && false =false
        boolean h = a > b && c++ == d; // false && false =false

        boolean i = a<b || ++c==d; // true || true = true
        boolean y = a>b || ++c==d; // false || true = true

        System.out.println(e);
        System.out.println( y);

    }
}
