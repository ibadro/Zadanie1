package Lesson21;

public class Test3 {
    Test3() {
        System.out.println("Eto konstructor");
    }

    void Test3() {
        System.out.println("eto metod'");
    }
}


class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}