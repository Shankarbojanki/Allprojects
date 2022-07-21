package Threads1;


class Runner extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println(i+"-->Hello world  " );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }
}
class Runner2 extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println(i+"-->Runner2 " );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class App {
    public static void main(String[] args) {
         Runner runner1 = new Runner();
         runner1.start();

        Runner2 runner2 = new Runner2();
        runner2.start();

    }
}
