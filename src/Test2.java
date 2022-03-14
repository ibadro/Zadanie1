class BankAccount {
        int id;
        String name;
        double balance;

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

