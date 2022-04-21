package Lesson25;
/*Полиморфизм*/
public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
     /*   Help_able h = new Teacher();
        emp1.help();
        emp1.work();
        emp2.work();
        emp3.work();  или  */
Employee [] array2 = {emp1,emp2,emp3};
for (Employee emp:array2){
    emp.work();
}
     }
}
abstract class Employee implements Help_able{
    void sleep(){  System.out.println(" Работа спит"); }
    abstract void work();
}
class Teacher extends Employee implements Help_able{
    public void help (){ System.out.println("Teacher helps");  }
    void work(){  System.out.println("Teacher work"); }
}
class Driver extends Employee {
    public void help (){ System.out.println("Driver helps");  }
    void work() { System.out.println("Driver work");  }
}
class Doctor extends Employee {
    public void help (){ System.out.println("Doctor helps");  }
    void work() {  System.out.println("Doctor work"); }
}
interface Help_able{
    void help();
}