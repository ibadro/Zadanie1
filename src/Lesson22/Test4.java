package Lesson22;

public class Test4 {
}

class Human2 {
    Human2(String n) {
        this(n, null);
    }

    Human2(String n, String s) { // создаем конструктор
        name = n;
        surname = s;
    }

    String surname;
    String name;
}

class Student2 extends Human2 {
    Student2() {
        // когда вы создаете обьет чайлд класса то вызывается соотвествующий конструктор  в данном случае Студент2 и внтури конструктора вызывется конструктор парент класса с помощью ключевого класса super
        super("petia");
    }

    public static void main(String[] args) {
        Student2 s = new Student2();
    }
}
