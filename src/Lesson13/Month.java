package Lesson13;
// В классе Month создайте метод, у котрого 11 параметр типа данных int.
// Этот параметр будет указывать порядковый номер месяца. Исползуя функционал switch, выведите на экран колличество дней этого месяца(2015). проверьте работу данного метода в main.

public class Month {
    public static void dayQyantyty(int n) {
        switch (n) {
            case 2:
                System.out.println("28 day"); break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 day"); break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println("31 day"); break;
            default:
                System.out.println(" Такого месяца  не существует");

        }
    }

    public static void main(String[] args) {
        dayQyantyty(0);
        dayQyantyty(1);
        dayQyantyty(2);
        dayQyantyty(4);
        dayQyantyty(-5);
        dayQyantyty(10);
        dayQyantyty(12);


    }
}

