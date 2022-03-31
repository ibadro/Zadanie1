package Lesson15;
// переписать домашнее задание урока 14 так , чтобы OUTER и INNER циклы  представяли собой while loop, а Middle цикл представлял собой do while llop.

public class Home {
    static void time() {
        int chas = 0;
        OUTHOR:
        while (chas < 6) {
            int minuta = -1;
            MIDDLE:
            do {
                minuta++;
                if (chas > 1 && (minuta & 10) == 0) {
                    break OUTHOR;
                }
                int sekunda = 0;
                INNER:
                while (sekunda < 60) {
                    if (sekunda * chas > minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                    sekunda++;
                }

            } while (minuta < 59);
            chas++;
        }

    }

    public static void main(String[] args) {
        time();
    }
}

