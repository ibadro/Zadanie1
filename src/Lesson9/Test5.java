package Lesson9;


//Вычислите устно output-ы Test1/2/3, а затем проверьте в компиляторе.

 public class Test5 {
    int a = 1;
    static int b = 2;
    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
       // System.out.println(Test3_1.b);
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
      //  t.abc(4);
        // 2 4 1 2
    }
}