package Lesson14;

public class Test5 {
    public static void main(String[] args) { //код который выводит на экран  число до 100, но не хочу чтобы выводилось на экран  число 87
        for (int i = 1; i <= 100; i++) {
            if (i == 87) {
                continue;
//            }
//            if (i % 55 == 0) {
//                break;
            }
            System.out.println(i);
        }
    }

}

class Test55 {
    public static void main(String[] args) { //выводить на экран если i станет равен 7 прекращал свою работу
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

    }
}

class Test523425234 {
    public static void main(String[] args) { //код который выводит на экран  число до 100, но не хочу чтобы выводилось на экран  число 10 и нацело делится на 55
        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                continue;
            }if (i % 55 == 0) {
           break;
            }
            System.out.println(i);
        }
    }

}