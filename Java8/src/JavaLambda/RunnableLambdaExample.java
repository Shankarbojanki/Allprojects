package JavaLambda;

class ThreadDemo implements Runnable {
    public void run() {
        System.out.println("run method called");
    }
}


public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread thread=new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable=()->System.out.println("run method callled using lambda");
        Thread thread1=new Thread(runnable);
        thread1.start();
    }
}
