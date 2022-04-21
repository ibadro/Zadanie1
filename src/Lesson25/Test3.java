package Lesson25;
// кастинг
public class Test3 {
    public static void main(String[] args) {
        Employеe22 emp1 = new Doctor22();
        Employеe22 emp2 = new Teacher22();
        Employеe22 emp3 = new Driver22();
        //Doctor22 d1 = (Doctor22)emp1; // замаркировал перерменную д1 под доктора
        System.out.println(((Doctor22)emp1).specializasya);
        ((Doctor22)emp1).leshit();
    }
}
    class Employеe22{
        double salary= 100;
        String name = "kolya";
        int age;
        int experience;
        void eat () {        System.out.println("kushat");    }
        void sleep () {        System.out.println("spat");    }
    }
    class Doctor22 extends  Employеe22 {
       String specializasya = "hirurg";
        void leshit () {  System.out.println("Leshit");    }
    }
    class  Teacher22 extends  Employеe22 {
          int kolichestvoushenikov;
         void ushit () { System.out.println("Ushit");    }
    }
    class Driver22 extends  Employеe22 {
       String nazvaniemashini;
        void vodit() {  System.out.println("Vodit");    }
    }


