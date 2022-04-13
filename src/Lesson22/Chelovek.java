package Lesson22;

// Инкапсюляция
public class Chelovek {
    final String pol;

    Chelovek(String pol) {
        this.pol = pol;
    }

    private String name; // в данном слуяае для перменной Name мы применили инкапсюляцию
    public String getName() { // getName - для того чтобы показывать имя
       return name;
    }
public void setName(String s) { // setName - для того чтобы изменять имя
    name = s;
}
    private int vozrast;
    public int getVozrast(){
        return vozrast;
    }
    public void setVozrast(int i){
        if(i>0){
            vozrast=i;
        }
    }






    int ves;

}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("Male");
        c.name = "Petia";
        c.vozrast = 25; // мы должны оганичить вес и возраст
        c.ves = 80;
    }
}