package Lesson23;

public class Test4 {
    void abc(Animal a ){System.out.println("A"); }
    void abc(Mouse m){
        System.out.println("M");
    }
    public static void main(String[] args) {
        Test4 t = new Test4();
        Animal an = new Mouse(); // compail time binding  так как это переменная
        t.abc(an);
        an.getName(); // run tipe binding
    }

    }
    class Animal{
        void getName() {
            System.out.println("Animal");
        }
    }
    class Mouse extends Animal {
        void getName () {
            System.out.println("Mouse");
        }
    }

