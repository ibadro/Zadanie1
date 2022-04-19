package Lesson24;

public class Test3 {
    class Employеe {
        String name;
        int age;
        int experience;
        void eat() {  System.out.println("kushat");  }
        void sleep() {  System.out.println("spat");   }
    }
    abstract class Tesasher extends Employеe implements Help_able { int kolichestvoushenikov;
        void ushit() {
            System.out.println("Ushit");
        }

        public void pomosh() { System.out.println(" usitel okaz pomosh");}
         public void tushitPojar(){ System.out.println(" usitel tushit pojar");  }
        }
        abstract class Driver extends Employеe implements Help_able,Swim_able {
        String nazvaniemashini;
            void vodit() { System.out.println("Vodit");  }
            public void pomosh() { System.out.println(" voditel okaz pomosh");}
            public void tushitPojar(){ System.out.println(" voditel tushit pojar");  }
        }
    }
    interface Help_able {
        void pomosh();
        void tushitPojar();
    }
    interface Swim_able {
        void swim();
    }
