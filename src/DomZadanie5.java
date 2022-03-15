    class BankAccount1 {

        int id = 10;
        String name = "Petr";
        double balance = 100;

        void popolnenieSheta(double summaPopolnenya) {
            System.out.println("Balans do poplnenya: " + balance);
            System.out.println("Balans popolnyetcya na: " + summaPopolnenya);
            balance += summaPopolnenya;
            System.out.println("Balans posle poplnenya: " + balance);
            System.out.println();
        }

        void snyantieSoSheta(double summaSnytya) {
            System.out.println("Balans do snyatya: " + balance);
            System.out.println("Balans umenshaetsya na: " + summaSnytya);
            balance -= summaSnytya;
            System.out.println("Balans posle snyatya: " + balance);
            System.out.println();
        }
    }
                    class BankAccounttest1 {

                        public static void main(String[] args) {
                            BankAccount1 MyAccount = new BankAccount1();

                            MyAccount.popolnenieSheta(30.5);
                            MyAccount.snyantieSoSheta(20.5);

                        }
                    }
