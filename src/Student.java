public class Student {

        int studentId;
        String name;
        String surname;
        int course;
        double sr_ocenka_ekonom;
        double sr_ocenka_mat;
        double sr_ocenka_in;
    }
    class StudentTest {

    double sredArifmetOcenka (Student st) {
            double sredOcenka = (st.sr_ocenka_ekonom + st.sr_ocenka_mat + st.sr_ocenka_in ) / 3;
            System.out.println("Srednya Arifmet Ocenka Stedenta " + st.name + " "+  st.surname + ":   " + sredOcenka);
            return sredOcenka;

        }

        public static void main(String[] args) {

            Student st1 = new Student();
            st1.studentId = 1;
            st1.name = "Ivan";
            st1.surname = "Trusov";
            st1.course = 3;
            st1.sr_ocenka_ekonom = 5.2;
            st1.sr_ocenka_mat = 8.2;
            st1.sr_ocenka_in = 6.2;

            Student st2 = new Student();
            st2.studentId = 2;
            st2.name = "Iaaaa";
            st2.surname = "Taaaaa";
            st2.course = 8;
            st2.sr_ocenka_ekonom = 1.2;
            st2.sr_ocenka_mat = 9.2;
            st2.sr_ocenka_in = 9.2;

            Student st3 = new Student();
            st3.studentId = 3;
            st3.name = "Iv";
            st3.surname = "Trus";
            st3.course = 5;
            st3.sr_ocenka_ekonom = 5.2;
            st3.sr_ocenka_mat = 8.2;
            st3.sr_ocenka_in = 4.2;

            // System.out.println("Средняя орифмет оценка" + "   " + st1.name + " " + st1.familya + "   " + "=" + "   " + (st1.sr_ocenka_ekonom + st1.sr_ocenka_mat + st1.sr_ocenka_in) / 3);
            //System.out.println("Средняя орифмет оценка" + "   " + st2.name + " " + st2.familya + "   " + "=" + "   " + (st2.sr_ocenka_ekonom + st2.sr_ocenka_mat + st2.sr_ocenka_in) / 3);
            //System.out.println("Средняя орифмет оценка" + "   " + st3.name + " " + st3.familya + "   " + "=" + "   " + (st3.sr_ocenka_ekonom + st3.sr_ocenka_mat + st3.sr_ocenka_in) / 3);

            StudentTest sTest = new StudentTest();
            sTest.sredArifmetOcenka(st1);
            sTest.sredArifmetOcenka(st2);
            sTest.sredArifmetOcenka(st3);


        }
    }