package Lesson20;
//Урок 20 Всё о классе ArrayList
import java.util.ArrayList;
public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new  Car();
        list.add(c);
        ArrayList <String> list2 =new ArrayList<String>();
      //  ArrayList <String> list2 =new ArrayList (); тоже самое

        list2.add("poka");

        }


    }


class Car  {}
class Stusent{}
