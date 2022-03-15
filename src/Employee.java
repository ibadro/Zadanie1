public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String departament;

    public Employee(int id2, String surname2, int age2, double salary2, String departament2) {
        id = id2;
        surname=surname2;
        age =age2;
        salary=salary2;
        departament =departament2;

        }

    double uvelishenieZarplati () {
        salary  *=2;
        return salary;
                

    }
}
class Employeetest {


}