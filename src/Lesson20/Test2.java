package Lesson20;

import java.util.ArrayList;
import java.util.SortedMap;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("ok");
        list.add("pasda");
        list.add(1, "pazxsda");
        for (String s : list) {
            System.out.println(s + " ");
        }
        System.out.println();
        System.out.println(list.get(3));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
        list.set(1, "!!!!");
        for (String s : list) {
            System.out.println(s + " ");
        }

    }
}
