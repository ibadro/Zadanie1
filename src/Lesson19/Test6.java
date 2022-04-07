package Lesson19;

public class Test6 {
    public static void main(String[] args) {
        String[] students = {"ivan;", "petr", "sidr"};
        String[] exams = {"matem;", "goegraf", "filosof"};
        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
//         ivan; matem;
//        ivan; goegraf
//        ivan; filosof
//        petr matem;
//        petr goegraf
//        petr filosof
//        sidr matem;
//        sidr goegraf
//        sidr filosof
