package ОсновыJava.КлассыОбьектыМетоды;

public class Pwr {
    double b;
    int e;
    double val;
    Pwr(double base, int exp) {
        b = base;
        e = exp;
        val = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) val = val * base;
    }
        double get_pwr() {
            return val;
}           class DemoPwr {
                public static void main(String args[]) {
                    Pwr x = new Pwr(4.0, 2);
                    Pwr у = new Pwr(2.5, 1);
                    Pwr z = new Pwr(5.7, 0);
                    System.out.println(x.b + " в степени " + х.е +  " равно + x.get pwr());
                            System.out.println(у.b + " в степени " + у.е +  " равно " + у.get _pwr () ) ;
                    System.out.println(z.b + " в степени *' + z. е +     " равно II + z.get _pwr () ) ;
                }
}
