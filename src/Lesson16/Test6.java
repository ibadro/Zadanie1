package Lesson16;

public class Test6 {
    public static void main(String[] args) {
        String s = "PrIvRt";
        String s2 = s.toLowerCase(); //меняте регистр всех на нижний
        System.out.println(s2);

        String s3 = s.toUpperCase(); //меняте регистр всех на верхний
        System.out.println(s3);

        boolean b = s.contains("T:2"); //содержит он в себе T:2?
        System.out.println(b);


    }
}
