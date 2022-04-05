package Lesson17;
// Создайте класс, в котром создайте метод ravenstvo. Инпут паратметрами данного метода будут 2 обькта класса StringBuilder
// Модод должен иметь boolean tupe, возвращать true, если значения обьетов сопадают, false - если не совпадают.
// Продемонстрируйте данный метод.

public class HomeWork {
    public static boolean ravenstvo (StringBuilder sb1, StringBuilder sb2){
        boolean result =true;
        if (sb1.length()== sb2.length()) {
            for (int i=0; i<sb1.length(); i++){
                if(sb1.charAt(i) !=sb2.charAt(i)){
                    result =false;
                    break;
                }
            }
        }else {
            result=false;
        }
        return result;
    }
}
class HomeWorkTest {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("hello");
        boolean a = HomeWork.ravenstvo(sb3,sb4);
        System.out.println(a);
        System.out.println(HomeWork.ravenstvo(sb4,sb5));
        System.out.println(HomeWork.ravenstvo( new StringBuilder(""), new StringBuilder("")));
        System.out.println(HomeWork.ravenstvo( new StringBuilder(), new StringBuilder()));

    }
}