package Interface_supplier;


class ThreadDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("run method called......");
    }
}
public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread thread=new Thread(new ThreadDemo());
        thread.start();



        Runnable runnable=() ->{
            System.out.println("run method called by java8");
        };
        Thread thread1=new Thread(runnable);
        thread1.start();
    }
}
