package Lesson18;
// МАССИВЫ Статическая инициализация
public class Test1 {
    public static void main(String[] args) {
        int[] array1;
        String[] array2;
        double[][] array3;
        array1 = new int[8]; // длина 8
        array2 = new String[3]; // длина3
        array3 = new double[4][2]; // двумерный масив дабл будет содержать 4 элемента т е 4 одномерных массива длина которых равны 2ум
        //     System.out.println(array2.length); // у стринга length это метода а у массива это переменная
        array2[0] = "privet";
        array2[1] = "poka";
        array2[2] = "Ok";
        array3[0][0] = 3.14;
        array3[2][1] = 3.14;
        double[] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;
        array3[1] = array5; } }
