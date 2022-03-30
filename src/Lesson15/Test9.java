package Lesson15;

public class Test9 {
    public static void main(String[] args) { // ВЫВОДИТЬ НА ЭКРАН ВРЕМЯ
        int chas=0;

        OUTER: // тело лупа буду обрабатывать пока час меньше 24
        do{
           int minuta =0; // обьявил в цикле  переменную минуту равную 0

            INNER:
            while (minuta<60) { //  и написал цикл , пока минута меньше 60 выводить на экран час:минута, затем увеличиваю минуту на еденицу
                  System.out.println(chas + ":" + minuta);
                minuta++;
            }
            chas ++; //  в конце кода увелиыиваю час на один
        }
        while (chas<24);
    }
}


