package Functionalinterface;

interface Shape{
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle draw method");
    }
}
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle draw method");
    }
}
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("square draw method");
    }
}
public class LambdaExample {
    public static void main(String[] args) {
       Shape rectangle= ()->System.out.println("rectangle draw method");
        rectangle.draw();
    }
}
