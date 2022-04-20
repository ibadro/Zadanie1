package Lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employеe e = new Driver();
        System.out.println(h.a);
        h.pomosh();
        h.tushitPojar(" voda");
        s.swim();
    }
}
    class Employеe {
        String name;
        int age;
        int experience;
        void eat() {  System.out.println("kushat");  }
        void sleep() {  System.out.println("spat");   }
    }
    class Driver extends Employеe implements Help_able,Swim_able {
        String nazvaniemashini;
        void vodit() { System.out.println("Vodit");  }
        public void pomosh() { System.out.println(" voditel okaz pomosh");}
        public void tushitPojar(String s){ System.out.println(" voditel tushit pojar"+s); }
        public void swim (){ System.out.println(" voditel mojet plavat");   }
    }
    abstract class Tesasher extends Employеe implements Help_able { int kolichestvoushenikov;
        void ushit() { System.out.println("Ushit");  }
        public void pomosh() { System.out.println(" usitel okaz pomosh");}
         public void tushitPojar(String s){ System.out.println(" usitel tushit pojar"+s);  }
        }
    interface Help_able {
    public abstract void pomosh();
        void tushitPojar( String predmet);
        public final static int a=10;
    }
    interface Swim_able {
        void swim();

    }

