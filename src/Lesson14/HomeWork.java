package Lesson14;

import org.w3c.dom.UserDataHandler;

// Создать класс. В классе статичный метод, который будет выводить на экране время в формате час:минута:секунда в интервале 0 до 6 часов
// Если час больше единицы и минута кратна 10-ти, то метод нужно закончить. Если же (секунда умноженная на час) больше минуты,
// то пора переходить на другую минтуту. Продемонстрировать данный метод в действии.
public class HomeWork {
    static void time (){
        OUTHOR:
        for (int chas=0; chas <6; chas++ ){
            MIDDLE:
            for (int minuta=0; minuta<60; minuta++){
                if (chas>1 && minuta % 10 ==0) { break OUTHOR;}
                INNER:
                for (int sekunda =0; sekunda<60; sekunda++){
                    if(sekunda* chas> minuta){continue MIDDLE;}
                    System.out.println(chas + ":"+ minuta+ ":"+sekunda);
                }

            }
        }

    }
    public static void main(String[] args) {
        time();
    }
}
