package Lesson6;

//Урок 6 - Перегрузка методов и конструкторов (overloading). Ключевое слово this

public class Lesson_6_Overloading_This {

}

class Zero{

    int numbers (){
        int result1 = 0;
        System.out.println("Сумма все чисел: " + result1);
        return result1;
    }
    int numbers (int a){
        int result2 = a;
        System.out.println("Сумма все чисел: " + result2);
        return result2;
    }
    int numbers (int a, int b){
        int result3 = a + b ;
        System.out.println("Сумма все чисел: " + result3);
        return result3;
    }
    int numbers (int a, int b, int c){
        int result4 = a + b + c;
        System.out.println("Сумма все чисел: " + result4);
        return result4;
    }
    int numbers (int a, int b, int c, int d){
        int result5 = a + b + c + d;
        System.out.println("Сумма все чисел: " + result5);
        return result5;
    }
    public static void main(String[] args) {
        Zero zero1 = new Zero();

        zero1.numbers();
        zero1.numbers(100);
        zero1.numbers(99,100500);
        zero1.numbers(33,72,85);
        zero1.numbers(45,68,44,21);

    }
}