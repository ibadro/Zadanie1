package Lesson5;

//Урок 5 - Создание объектов. Понятие «конструктор». Объявление и вызов методов.

 class  Lesson_5_Method_Сonstructors {

}
class BankAccount {

    int id = 10;
    String name = "Tatyana";
    double balance = 100;

    void popolnenieScheta(double summaPopolneniya) {
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Баланс пополнения на: " + summaPopolneniya);
        balance+=summaPopolneniya;// summaPopolneniya = summaPopolneniya +num;
        System.out.println("Баланс после пополнения: " + balance);
        System.out.println();
    }


    void shyatieSoScheta(double summaSnyatiya) {
        System.out.println("Баланс до снятия: " + balance);
        System.out.println("Баланс уменьшается на: " + summaSnyatiya);
        balance-=summaSnyatiya;
        System.out.println("Баланс после снятия: " + balance);
        System.out.println();
    }
}

class BankAccountTest {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.popolnenieScheta(30.5);
        myAccount.shyatieSoScheta(20.5);
    }
}

class Employee {
    int id;
    String surname;
    int age;
    int salary;
    int department;

    Employee(int id, String surname, int age, int salary, int department){
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    int valueUpSalary(){
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Dokman", 18, 234, 1);
        Employee employee2 = new Employee(2, "Brokman", 40, 345, 9);
        employee1.valueUpSalary();
        employee2.valueUpSalary();
        System.out.println("Значение новой зарплаты: " + employee1.salary);
        System.out.println("Значение новой зарплаты: " + employee2.salary);

    }
}

