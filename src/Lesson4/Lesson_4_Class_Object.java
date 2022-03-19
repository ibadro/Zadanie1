package Lesson4;

//Урок 4 - Понятия «класс» и «объект». Знакомство со ссылочными типами данных

public class Lesson_4_Class_Object {

}

class Student {
    int studentIDNumber;
    String name;
    String surname;
    int yearGfStudy;
    //оценки по 10-ти балльной шкале
    double averageScoreInMath;
    double averageScoreInEconomics;
    double averageScoreInForeignLanguage;

    Student(int studentIDNumber1,String name1,String surname1,int yearGfStudy1,double averageScoreInMath1,double averageScoreInEconomics1,double averageScoreInForeignLanguage1){
        studentIDNumber = studentIDNumber1;
        name = name1;
        surname = surname1;
        yearGfStudy = yearGfStudy1;
        averageScoreInMath = averageScoreInMath1;
        averageScoreInEconomics = averageScoreInEconomics1;
        averageScoreInForeignLanguage = averageScoreInForeignLanguage1;
    }
    Student(int studentIDNumber2,String name2,String surname2,int yearGfStudy2){
        this(studentIDNumber2, name2, surname2, yearGfStudy2,0,0,0);

    }
    Student(){

    }
}

class StudentTest {

    double sredArifmOcenka (Student st) {// ?
        double sredOcenka =(st.averageScoreInMath + st.averageScoreInEconomics + st.averageScoreInForeignLanguage) / 3;
        System.out.println("Средняя арифметическая оценка студента " + st.name + " " + st.surname + ": " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {


        Student student1 = new Student(8,"Bobo","Boboshed",9,9.99,9.99,9.99);

        Student student2 = new Student(1,"Iamnew","DontSpeak",0);
        student2.averageScoreInMath = 8.43;
        student2.averageScoreInEconomics = 1.23;
        student2.averageScoreInForeignLanguage = 6.9;

        Student student3 = new Student();
        student3.studentIDNumber = 3;
        student3.name = "Vacya";
        student3.surname = "Pupkin";
        student3.yearGfStudy = 6;
        student3.averageScoreInMath = 9.9;
        student3.averageScoreInEconomics = 2.99;
        student3.averageScoreInForeignLanguage = 1.1;


        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(student1);
        sTest.sredArifmOcenka(student2);
        sTest.sredArifmOcenka(student3);
/*
        System.out.println("Средняя арифметическая оценка студента " + student1.name + " " + student1.surname + " = " + (student1.averageScoreInEconomics + student1.averageScoreInForeignLanguage + student1.averageScoreInMath) / 3);
        System.out.println("Средняя арифметическая оценка студента " + student2.name + " " + student2.surname + " = " + (student2.averageScoreInEconomics + student2.averageScoreInForeignLanguage + student2.averageScoreInMath) / 3);
        System.out.println("Средняя арифметическая оценка студента " + student3.name + " " + student3.surname + " = " + (student3.averageScoreInEconomics + student3.averageScoreInForeignLanguage + student3.averageScoreInMath) / 3);
   */
    }
}