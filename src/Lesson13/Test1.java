package Lesson13;
// конструктор Switch
public class Test1 {
}
class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public  static void main(String[] args) {
        Student st1 = new Student(1);
        switch (st1.grade){
            case 2: System.out.println("Dvoechnik"); break;
            case 3: System.out.println("Troechnik"); break;
            case 4: System.out.println("Udarnik"); break;
            case 5: System.out.println("Otlicnik"); break;
            default:System.out.println("Ocenka ne verna");
        }
//            if (st1.grade == 2) {       Выше приведен альтернативный вариант решения задачи
//                System.out.println("Dvoechnik");
//            } else if (st1.grade == 3) {
//                System.out.println("Troechnik");
//            } else if (st1.grade == 4) {
//                System.out.println("udarnik");
//            } else if (st1.grade == 5) {
//                System.out.println("Otlicnik");
//            } else {
//                System.out.println("ocenka nt verna");
    }
}

