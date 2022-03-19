package Lesson7_1;

class Employee7_1_2 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(5);
        Employee emp2 = new Employee("Ivanov");
        /// Employee emp3 = new Employee (555.2);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //   System.out.printf(emp1.salary);

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        // System.out.printf(emp2.salary);

        emp1.getId();
        emp1.getSurname();
        emp1.getSalary();

        emp2.getId();
        emp2.getSurname();
        emp2.getSalary();

    }

}