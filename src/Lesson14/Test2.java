package Lesson14;

public class Test2 {
    public static void main(String[] args) { // выводить на экран  все цифры меньше от 1 до 10
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
}
class Rew {
    public static void main(String[] args) { // выводить на экран  все цифры меньше
        for (int a = 1, j = 2, k = 10; a < 11; a++, k = k - 5, j++) {
            System.out.println(a + ":" + j + ":" + k);
        }
    }
}
class Qwerqwer {
    public static void main(String[] args) { // выводить на экран  все цифры меньше от 1 до 10
        for (int i = 1; i < 11; ) {
            System.out.println(i);
            i++;
        }
    }
}