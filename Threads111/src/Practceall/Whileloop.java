package Practceall;

          //The while loop is considered as a repeating if statement.
         // If the number of iteration is not fixed, it is
        // recommended to use the while loop.

public class Whileloop {
    public static void main(String[] args) {
        int i=1;
        while (i<=10) {
            System.out.print(i + " ");
            i++;
        }

//        while infinite loop
//        while (true){
//            System.out.println("infy");
//        }

        //If the number of iteration is not fixed and
        // you must have to execute the loop at least once,
        // it is recommended to use a do-while loop.
        //Java do-while loop is called an exit control loop.
        // Therefore, unlike while loop and for loop,
        // the do-while check the condition at the end of loop body.
        // The Java do-while loop is executed at least once because
        // condition is checked after loop body.
        System.out.println("\n");
        System.out.println("do-while");

        int a=1;
        do {
            System.out.print(a + " ");
            a++;
        }while (a<=10);
    }
}
