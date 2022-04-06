package Lesson18;

public class Test7 {
    public static void main(String[] args) {
        char [] array= { 'P','r','i','v','e','t'};
//        String s =new String(array);
//        System.out.println(s);
        StringBuilder sb =new StringBuilder("hello");
      //  sb.append(array,2,3);
        System.out.println(sb); // helloive
        sb.insert(2,array,1,3);
        System.out.println(sb); //herivllo
    }
}
