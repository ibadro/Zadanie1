//написать метод который будет выводить на экран переменную типа данных int +boolean + string

public class MethodOverLoading {
//    void showInt(int i1) {
    void show(int i1) {
        System.out.println(i1);
    }
//        void showBoolean(boolean b1) {
    void show(boolean b1) {
        System.out.println(b1);
    }
//            void showString(String s1) {
    void show(String s1) {
        System.out.println(s1);
    }
}

        class MethodOverLoadingTest {
            public static void main(String[] args) {
                MethodOverLoading mO = new MethodOverLoading();
                int a =100;
//                mO.showInt(a);
                mO.show(a);
                boolean b = true;
//                mO.showBoolean(b);
                mO.show(b);
                String s =  "Privet";
//                mO.showString(s);
                mO.show(s);
            }

        }








