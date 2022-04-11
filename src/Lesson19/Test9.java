package Lesson19;
//создадим массив и его доина ровна 10 и динамически проинециализируем массив
public class Test9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;

        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
//создадим массив и его доина ровна 10    и проинециализируем с пом foreach  loop   - не можем проиводить димнамическую инициализ