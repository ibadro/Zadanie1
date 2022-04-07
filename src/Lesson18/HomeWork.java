package Lesson18;

//Создайте класс, в котором создайте метода сортировка. Инпут параметром данного метода будет одномерный массив
//типа Int. Метод должен возвращать уже отсjртированный по возрастанию массив. Продемонстрируйте метод.
public class HomeWork {
    public static int[] sortiriovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int [] array = {1, 9, 3, -8, 0, 5, 4, 1};
        sortiriovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] ); // -80113459
        }
    }
}
