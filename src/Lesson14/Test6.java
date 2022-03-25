package Lesson14;
// вывести минуты и часы на экран
public class Test6 {
    public void time (){
        OUTHOR:
        for (int chas=0; chas <=23; chas++ ){
            System.out.println("Nashalo oter loop");
                INNER:
                for (int minuta=0; minuta<=59; minuta++){
                System.out.println(chas+ ":" + minuta);
                if(minuta==30) {continue OUTHOR;}
            }
            System.out.println("Konec oter loop");
        }

    }
    public static void main(String[] args) {
        Test6 t =new Test6();
        t.time();
    }
}
