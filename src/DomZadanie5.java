public class DomZadanie5 {
    class BankAccount {
        int id =10;
        String name ="Petr";
        double balance= 100;

        void popolnenieSheta(double summaPopolnenya) {
            System.out.println("Balans do poplnenya: "+ balance);
            System.out.println("Balans popolnyetcya na: "+ summaPopolnenya);
            balance += summaPopolnenya;
            System.out.println("Balans posle poplnenya: "+ balance);
            System.out.println();
        }
        void snyantieSoSheta(double summaSnytya) {
            System.out.println("Balans do snyatya: "+ balance);
            System.out.println("Balans umenshaetsya na: "+ summaPopolnenya);
            balance -= summaPopolnenya;
            System.out.println("Balans posle snyatya: "+ balance);
            System.out.println();


            public static void main(String[] args) {

                BankAccount MyAcount = new BankAccount();
                BankAccount YourAcount = new BankAccount();
                BankAccount HisAcount = new BankAccount();

                MyAcount.id =1;
                MyAcount.name ="zaur";
                MyAcount.balance =1651.2;

//         System.out.println(MyAcount.id);
            }
        }

        class BankAccounttest {

            public static void main(String[] args) {

                BankAccount MyAcount = new BankAccount();
                BankAccount YourAcount = new BankAccount();
                BankAccount HisAcount = new BankAccount();

                MyAcount.id =6;
                MyAcount.name ="zaur";
                MyAcount.balance =1651.2;

                System.out.println(MyAcount.id);
                System.out.println(MyAcount.name);
                System.out.println(MyAcount.balance);
            }
        }
}
