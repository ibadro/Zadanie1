package Lesson12;

//Урок 12 Конструкции «if» и «if else». Ternary оператор.

public class Test10 {
    public static void main(String[] args) {
        int a = 10;

        //if(true/false)
        //if(a<30); не выполнится, но запустится
        //else if используем если нужно проверить нескольк оусловий

        if(a<20) ////Если использовать if/else без фигурных скобок {} то будет относится к нему только первое вырежение
            System.out.println("a меньше 20");//первое выражение
            //System.out.println("2");
            //a++;
        else//выражение else выполняется в том случаии если вырежинии if страница 9 было false
            System.out.println("a не меньше 20");

    }
} 