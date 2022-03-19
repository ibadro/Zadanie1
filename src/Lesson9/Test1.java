
//Вычислите устно output-ы Test1/2/3, а затем проверьте в компиляторе.

public class Test1 {
    int a = 1;
    //static int a = 2; вторая переменная с одинаковым именем
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main (String [] args) {
        Test1_1 t = new Test1_1();
     //   t.abc(3);
        // не скомпилируется, см 7
    }
}