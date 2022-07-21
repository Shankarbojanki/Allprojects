package Inheritance;

public class Animal2 {
    void eat() {
        System.out.println("eating.........");
    }
}
class Dog2 extends Animal2 {
    void sleep() {
        System.out.println("sleeping..........");
    }
}
class Cat2 extends Animal2{
    void jump() {
        System.out.println("jumping..........");
    }
}
class Testanimal2 {
    public static void main(String[] args) {
        Animal2 Dog2=new Dog2();
        Animal2 Cat2=new Cat2();

        Dog2.eat();
        Cat2.eat();

        Dog2 dog2=new Dog2();
        Cat2 cat2=new Cat2();

        dog2.eat();
        dog2.sleep();


        cat2.eat();
        cat2.jump();
    }
}
