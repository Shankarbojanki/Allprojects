package Threads4;

import java.util.Scanner;

class processor extends Thread{
    private boolean running=true;
    @Override
    public void run() {
        while (running) {
            System.out.println("hello");

            try {
              Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown() {
        running=false;
    }
}

public class App {
    public static void main(String[] args) {

        processor proc1= new processor();
        proc1.start();

        System.out.println("press return to stop ");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();

        proc1.shutdown();
    }
}
