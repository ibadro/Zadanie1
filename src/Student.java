public class Student {
        int nomerstud;
        String name;
        String familia;
        int god_obush;
        double sr_ocenka_ekonom;
        double sr_ocenka_mat;
        double sr_ocenka_in;
    }
    class StudentTest {

        public static void main(String[] args) {

            Student St1 = new Student();
            St1.nomerstud = 1;
            St1.name = "Ivan";
            St1.familia = "Trusov";
            St1.god_obush = 3;
            St1.sr_ocenka_ekonom = 5.2;
            St1.sr_ocenka_mat = 8.2;
            St1.sr_ocenka_in = 6.2;

            Student St2 = new Student();
            St2.nomerstud = 2;
            St2.name = "Iaaaa";
            St2.familia = "Taaaaa";
            St2.god_obush = 8;
            St2.sr_ocenka_ekonom = 1.2;
            St2.sr_ocenka_mat = 9.2;
            St2.sr_ocenka_in = 9.2;

            Student St3 = new Student();
            St3.nomerstud = 3;
            St3.name = "Iv";
            St3.familia = "Trus";
            St3.god_obush = 5;
            St3.sr_ocenka_ekonom = 5.2;
            St3.sr_ocenka_mat = 8.2;
            St3.sr_ocenka_in = 4.2;

            System.out.println("Средняя орифмет оценка" + "   " + St1.name + " " + St1.familia + "   " + "=" + "   " + (St1.sr_ocenka_ekonom + St1.sr_ocenka_mat + St1.sr_ocenka_in) / 3);
            System.out.println("Средняя орифмет оценка" + "   " + St2.name + " " + St2.familia + "   " + "=" + "   " + (St2.sr_ocenka_ekonom + St2.sr_ocenka_mat + St2.sr_ocenka_in) / 3);
            System.out.println("Средняя орифмет оценка" + "   " + St3.name + " " + St3.familia + "   " + "=" + "   " + (St3.sr_ocenka_ekonom + St3.sr_ocenka_mat + St3.sr_ocenka_in) / 3);
        }
    }