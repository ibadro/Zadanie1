package Lesson15;

public class Test3 {
    public static void main(String[] args) {
        boolean b = true;     // задача выводить числа от 1 до N до тех пор пока не наткнемся на число которое нацело делиться на и 3 и на 7
        int a= 1;
        while (b){
            System.out.println(a);
            if (a%3==0 && a%7==0){ // a%3 - нацело делиться на 3 и a%7 нацело делиться на 7
                b=false;
            }
            a++;
        }
    }
}
