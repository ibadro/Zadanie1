package Lesson24;

public class Test4 {

    Jampable j1= new Human();
    Jampable j2= new Animal();

}
    class Human implements Jampable{public void jump(){ System.out.println(" Human Jamp"); }}
    class Animal implements Jampable{public void jump(){ System.out.println(" Animal Jamp"); }}
interface Jampable{
    void jump();
}
interface A2{void abc();}
interface B2 extends  A2,Jampable {void def();}

abstract class D implements A2,B2{}