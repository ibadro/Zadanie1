package Lesson18;

//Создайте класс, в котором создайте метод showArray. Инпут параметром данного метода будет двуменрный массив типа Стрингю
//Метод должен выводить на экран данный массив в следующем виде:{{элемент00, элемент01},{элемент10},{эдемент10, элемент11}}
//Сожержимое, естественно, будет зависеть от Вашего массива.
//Продементстрируйте метод
public class HomeWork2 {
    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ",");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.println("  }");
    }
    public static void main(String[] args) {
        String array[][] = {{"apple", "orange"}, {"hello", "bye", "ok"}, {"car"}};
        showArray(array);
        showArray(new String[][]{{"man", "woman"}, {"male", "female"}});
    }
}
//{ {apple,orange}, {hello,bye,ok}, {car}  }
//        { {man,woman}, {male,female}  }