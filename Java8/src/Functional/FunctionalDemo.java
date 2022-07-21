package Functional;


import java.util.function.Function;

class FunctionImpl implements Function<String,Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
public class FunctionalDemo {
    public static void main(String[] args) {
    Function<String,Integer> function=new FunctionImpl();
        System.out.println(function.apply("Shankar"));

        Function<String,Integer> function1= (String s)->s.length();
        System.out.println(function1.apply("shabo"));
    }
}
