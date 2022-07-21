package JavaLambda;

interface  Shape{
    void draw();
}
class  Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle class : draw method");
    }
}
class Square implements Shape {
    public void draw() {
        System.out.println("Square class : draw method");
    }
}
class Circle implements Shape {
    public void draw() {
        System.out.println("circle  class : draw method");
    }
}

public class LambdaExample {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle();
        rectangle1.draw();
        Shape rectangle= () ->System.out.println("Rectangle class : draw method in java 8");
        rectangle.draw();
        Square square1=new Square();
        square1.draw();
        Shape square=()-> System.out.println("Square class : draw method in java 8");
        square.draw();
        Circle circle1=new Circle();
        circle1.draw();
        Shape circle=() -> System.out.println("Circle class : draw method in java 8");
        circle.draw();

        //passing parameter to lambda expression
        System.out.println("print method \npassing parameter to lambda expression");
        print(()-> System.out.println("Rectangle class : draw method in java 8"));
        print(()-> System.out.println("Square class : draw method in java 8"));
        print(()-> System.out.println("Circle class : draw method in java 8"));
        System.out.println("----------------------------------");

        print(rectangle);
        print(square);
        print(circle);
    }
    private static void print (Shape shape) {
        shape.draw();
    }
}
