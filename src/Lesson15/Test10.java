package Lesson15;
//задача такая же как в тест9 // ВЫВОДИТЬ НА ЭКРАН ВРЕМЯ
public class Test10 {
    public static void main(String[] args) {
       OUTHOR:
       for (int chas =0; chas <24; chas++){
            int minuta=0;
            INNER:
            while (minuta<60){
                System.out.println(chas+ ":"+ minuta);
                minuta++;
            }
        }
    }

}
