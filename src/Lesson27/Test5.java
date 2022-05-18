package Lesson27;

public class Test5 {
    static void abc() {
        System.out.println("rab met");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError e) {
            System.out.println("eror poiman");
        }
    }

}
/*  Но считается глупо ловить оишибки и делать этого не стоит */