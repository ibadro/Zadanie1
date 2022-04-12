package Lesson20;
// Создайте класс, в котором создайте метод abc. Инпут параметром данного метода будет n-oe количество параметров типа String
// Метод должен возвращать уже отсартированный обьект Arralist из неповторяющихся обьектов  типа String? взятых из параметра метода и выводить данный обьект на экран.
//Продемнострируйте данный метод.
import java.util.*;

public class HomeWork {
    public ArrayList<String> abc (String ...s) {
        ArrayList<String> aL = new ArrayList<>();
        for (String s1 : s) {
            if (!aL.contains(s1)) {
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        HomeWork i20 =new HomeWork();
        i20.abc("asd","sadasd","asdasdasd","qwer","qwerqwer");
    }

}

