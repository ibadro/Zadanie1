package Lesson6;

public class Employee {

    int id;
    String surname;
    int age;
    int salary;
    int department;

    Employee(int id, String surname, int age, int salary, int department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
}
    class EmployeeTest {
        public static void main(String[] args) {
            Employee emp1 = new Employee(1, "Dokman", 18, 234, 1);
            Employee emp2 = new Employee(2, "Brokman", 40, 345, 9);

        }
    }

