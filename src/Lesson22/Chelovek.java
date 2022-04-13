package Lesson22;

// Инкапсюляция
public class Chelovek {
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }private boolean clever;
    public boolean isClever(){
        return clever;
    }
    private String name; // в данном случае для перменной Name мы применили инкапсюляцию к имени
    public String getName() { // getName - для того чтобы показывать имя
        return name;
    }
    public void setName(String s) { // setName - для того чтобы   показывать и изменять имя
        name = s;
    }
    private int vozrast; // в данном случае для перменной Name мы применили инкапсюляцию к возрасту
    public int getVozrast() {  // setName - для того чтобы   показывать
        return vozrast;
    }
    public void setVozrast(int i) {  // setName - для того чтобы   показывать
        if (i > 0) {
            vozrast = i;
        }
    }
    public int ves; // в данном случае для перменной Name мы применили инкапсюляцию к весу
    public int getVes() {
        return ves;
    }
    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }
}
        class Test {
            public static void main(String[] args) {
                Chelovek c = new Chelovek("Male");
                c.setName("kolia");
                c.setVes(50);
                c.setVozrast(15);
                System.out.println(c.getName());
                System.out.println(c.getVes());
                System.out.println(c.getVozrast());
            }
        }
/* тамимо бразом с помощью инкапсюляции мы сокрыли свои переменные вес восзраст и вес, но с помощью паблик метода гет мы позволяем видеть значения этих переменных
а с пом метода set  мы позволяем менять эти перменные
так называемые сеттеры и геттеры и Is
 */