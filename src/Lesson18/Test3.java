package Lesson18;

public class Test3 {
    static String s;
    public static void main(String[] args) {
        //  int [] array = new int [-3]; // ошибка длина массива не может быть отрицательной
        int[] array = new int[3]; // ошибка вы вышли за границы массива
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        // array [3]=5;

        //   int [][] array2 = new int [3][];
        //  System.out.println(array2[0][1]); // ошибка обькт null

        // int [][] array2 = new int [3][];
        // System.out.println(s.length()); // ошибка null

    }
}

