package Lesson18;

public class Test6 {
    //  написать метод который принимает  в параметр массив и выводит ни экран его наибольшее и наименьшие элементы
    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) { // сравнение loop
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min element massiva: " + min + "   max element massiva:  " + max);
    }

    public static void main(String[] args) {
        double [] array1 = {1.05, -3.14, 8.0, 9.19, -3, 0,- 199};
        maxMin(array1);

    }
}
