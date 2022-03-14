public class Car {
       String color = "red";
        String engine = "v6";


    }
    class cartest {
        public static void main(String[] args) {
            int a;
            Car car1 = new Car();
            car1.color = "black";
            car1.engine = "V8";

            System.out.println("Svet: "+ car1.color);
            System.out.println("motor: "+ car1.engine);

        }

    }

