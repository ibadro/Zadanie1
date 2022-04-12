package Lesson20;
import jdk.jshell.JShell;

import java.util.ArrayList;
import java.util.SortedMap;
public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String ("Poka"));
        list.add(new String ("ok"));
        list.add(new String ("privet"));
        list.add(new String ("ok"));
        list.add(new String ("hello"));
        for (String sb:list) {
            System.out.println(sb + " ");
        }
        System.out.println(list.lastIndexOf(new String ("Poka")));
        System.out.println( );
        System.out.println(list.size( ));
        System.out.println(list.isEmpty( ));
    }

}
