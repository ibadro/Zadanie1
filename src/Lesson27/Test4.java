package Lesson27;
/* обработка эксепшена*/
public class Test4 {
    public static void main(String[] args) {
        int [] array  = {4,8,1};
        System.out.println("u nas est massiv");

        try {
            System.out.println(array[5]); // будет ошибка
            System.out.println("vsem horoshego dnya");
        }
        catch (ArrayIndexOutOfBoundsException e){ // ловим эксепшен
            System.out.println("bil poiman exception:"+ e);
        }
        finally { // всегда срабатывает
            System.out.println(" eto  finally block");
        }
        System.out.println("dannii kod ne imeet otnoshenia k isklusheniyam");
    }
}
