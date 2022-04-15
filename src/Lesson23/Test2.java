package Lesson23;


public class Test2 {
    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Tesasher t = new Tesasher();
//        Driver dr = new Driver();
//        Employеe e = new Employеe();

        Employеe emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.experience);
        System.out.println(emp1.age);
        emp1.eat();
        emp1.sleep();





        Employеe emp2 = new Tesasher();
        Employеe emp3 = new Driver();

        Xirurg x= new Xirurg();
        Doctor d2 = new Xirurg();
    }
}
    class Employеe{
        double salary=100;
        String name;
        int age;
        int experience;
        void eat () {        System.out.println("kushat");    }
        void sleep () {        System.out.println("spat");    }
    }
    class Doctor extends  Employеe {

        String specializasya;
        void leshit () {        System.out.println("Leshit");    }
    }
    class Xirurg extends Doctor{
    String skalpel;
    void operciya(){};

    }
    class  Tesasher extends Employеe {
        int kolichestvoushenikov;
        void ushit () {        System.out.println("Ushit");    }
    }
    class Driver extends Employеe {
        String nazvaniemashini;
        void vodit() {        System.out.println("Vodit");    }
    }


