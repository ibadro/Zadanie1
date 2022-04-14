package Lesson22;
/*Создайте класс СТудент со след пременнными: name(StringBuilder), course? grade. Приминет инкапсюляцию к данному классу.
Длина имени обьектов не должна быть менее 3ч символов, оценки должны быть числами в интервале от 1 до 10, курс должен быть
числом от 1 до4 включительно.
Создайте метод showinfo, который будет выводить всю информацию о студенте, не используя переменные класса Студент, придайте его переменным значения.
Произведите вызов метода Showinfo.
 */
public class Student555 {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName(){
        StringBuilder name2 =new StringBuilder(name);
        return name2;
    }
    public void setName(StringBuilder name){
        if(name.length() >3) {
            this.name=name;
        }
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course){
        if (course >= 1 && course <5){
            this.course=course;
        }
    }
    public int getGrade(){
        return grade;
    }
   public void setGrade(int grade) {
        if(grade>=1 && grade<11){
            this.grade = grade;
        }
    }
    public void showInfo(){
        System.out.println("Имя:  "+ getName() +  "  Курс:  " +  getCourse() + "   оценка: "+ getGrade());
    }
}
class Teststudet555 {
    public static void main(String[] args) {
        Student555 st1 = new Student555();
        StringBuilder sb1 = new StringBuilder("ivan");
        st1.setName(sb1);
        st1.setGrade(8);
        st1.showInfo();
    }
}