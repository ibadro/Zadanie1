package Lesson6;

public class MethodOverloading2 {
  public int sum ( int i1, int i2){ // sum является  overloaded
        return i1 +i2;
    }
    public String sum (String s1, String s2) { // sum является  overloaded
        return s1+s2;
    }
      }
class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();
        int a= mO2.sum(5,7);
        System.out.println(a);
        String s = mO2.sum("!!!!", "1111");
        System.out.println(s);
    }
}