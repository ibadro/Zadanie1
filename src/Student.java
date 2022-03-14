public class Student {
        int nomerstud;
        String Имя;
        String Фамилия;
        int годОбучения;
        double sr_ocenka_ekonom;
        double sr_ocenka_mat;
        double sr_ocenka_in;
    }
    class StudentTest {

        public static void main(String[] args) {

            Student St1 = new Student();
            St1.nomerstud = 1;
            St1.Имя = "Ivan";
            St1.Фамилия = "Trusov";
            St1.годОбучения = 3;
            St1.sr_ocenka_ekonom = 5.2;
            St1.sr_ocenka_mat = 8.2;
            St1.sr_ocenka_in = 6.2;

            Student St2 = new Student();
            St2.nomerstud = 2;
            St2.Имя = "Iaaaa";
            St2.Фамилия = "Taaaaa";
            St2.годОбучения = 8;
            St2.sr_ocenka_ekonom = 1.2;
            St2.sr_ocenka_mat = 9.2;
            St2.sr_ocenka_in = 9.2;

            Student St3 = new Student();
            St3.nomerstud = 3;
            St3.Имя = "Iv";
            St3.Фамилия = "Trus";
            St3.годОбучения = 5;
            St3.sr_ocenka_ekonom = 5.2;
            St3.sr_ocenka_mat = 8.2;
            St3.sr_ocenka_in = 4.2;

            System.out.println("Средняя орифмет оценка" + "   " + St1.Имя + " " + St1.Фамилия + "   " + "=" + "   " + (St1.sr_ocenka_ekonom + St1.sr_ocenka_mat + St1.sr_ocenka_in) / 3);
            System.out.println("Средняя орифмет оценка" + "   " + St2.Имя + " " + St2.Фамилия + "   " + "=" + "   " + (St2.sr_ocenka_ekonom + St2.sr_ocenka_mat + St2.sr_ocenka_in) / 3);
            System.out.println("Средняя орифмет оценка" + "   " + St3.Имя + " " + St3.Фамилия + "   " + "=" + "   " + (St3.sr_ocenka_ekonom + St3.sr_ocenka_mat + St3.sr_ocenka_in) / 3);
        }
    }