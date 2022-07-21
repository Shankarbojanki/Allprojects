package Functional;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {
    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer=new ConsumerImpl();
        consumer.accept("Hello shankar");

       Consumer<String> consumer1= (String input) ->System.out.println(input);
       consumer1.accept("Hey shankar");

    }
}
