package Lesson24;

// Абстарктные
public class Test2 {
        public static void main(String[] args) {
            Figura f1 = new Praymaygilnik();
//            System.out.println(f1.kolStoron);
            f1.ploshad();

        }

    }
abstract class Figura {
        int kolStoron = 0;
        abstract void perimetr();
        abstract void ploshad();
        void showinfo() {
            System.out.println(" Eto figura");
        }
    }

class Kvadrat extends Figura {
    int kolStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println(" perimtr kvadrata + " + 4 * storona1);
    }

    public void ploshad() {
        System.out.println(" ploshad  kvadrata + " + storona1 * storona1);
    }
}
    class Praymaygilnik extends Figura {
        int kolStoron = 4;
        int storona1 = 10;
        int storona2 = 5;

        public void perimetr() {
            System.out.println(" perimtr pryamougolnik + " + 2 * (storona1+storona2));
        }

        public void ploshad() {
            System.out.println(" ploshad  kpryamougolnik + " + storona1 * storona2);
        }
    }
    class Okrujnost extends Figura {
        int kolStoron = 0;
        int radius = 3;

        public void perimetr() {
            System.out.println(" perimtr Okrujnost + " + 2 * 3.14*radius);
        }

        public void ploshad() {
            System.out.println(" ploshad  Okrujnost + " + 3.14*radius*radius);
        }
    }

    abstract class Chetyrougolnik extends Figura {
    void def () {
        System.out.println("eto Chetyrougolnik ");
    }
    }