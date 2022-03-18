//       Измените класс Boy так, чтобы он имел 3 конструктора. 1-ый принимает все параметры. 2-ой — только id, name,
//        surname, course. 3-ий не принимает значений. Создайте в классе Boy 3 объекта с помощью разных констукторов.


 class Boy {

    public Boy(int studentId2, String name2, String surname2, int course2, double sr_ocenka_ekonom2, double sr_ocenka_mat2, double sr_ocenka_in2) {

        studentId = studentId2;
        name = name2;
        surname = surname2;
        course =  course2;
        sr_ocenka_ekonom =sr_ocenka_ekonom2;
        sr_ocenka_mat =sr_ocenka_mat2;
        sr_ocenka_in =sr_ocenka_in2;
    }
    Boy(int studentId3, String name3, String surname3, int course3) {
        this(studentId3,name3,surname3,course3,0,0,0);
    }
    Boy() {
    }
        int studentId;
        String name;
        String surname;
        int course;
        double sr_ocenka_ekonom;
        double sr_ocenka_mat;
        double sr_ocenka_in;
    }
    class Boytest {

        double sredArifmetOcenka (Boy st) {
            double sredOcenka = (st.sr_ocenka_ekonom + st.sr_ocenka_mat + st.sr_ocenka_in) / 3;
            System.out.println("Srednya Arifmet Ocenka Stedenta " + st.name + " " + st.surname + ":   " + sredOcenka);
            return sredOcenka;
        }

    public static void main(String[] args) {

        Boy st1 = new Boy();
        st1.studentId = 1;
        st1.name = "Ivan";
        st1.surname = "Trusov";
        st1.course = 3;
        st1.sr_ocenka_ekonom = 5.2;
        st1.sr_ocenka_mat = 8.2;
        st1.sr_ocenka_in = 6.2;

        Boy st2 = new Boy(2,"Alex","Penrov", 1);
        st2.sr_ocenka_ekonom = 1.2;
        st2.sr_ocenka_mat = 9.2;
        st2.sr_ocenka_in = 9.2;

        Boy st3 = new Boy(3,"ilia","Sidorov",4,9.01,9,10 );
        Boytest sTest = new Boytest();
        sTest.sredArifmetOcenka(st1);
        sTest.sredArifmetOcenka(st2);
        sTest.sredArifmetOcenka(st3);
    }
}