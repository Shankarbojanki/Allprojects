package Functionalinterface;
@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg);

    default void m1() {
        System.out.println("default");
    }
    static void m2() {
        System.out.println("static");
    }
}
