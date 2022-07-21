package Practceall;

public class Breakstatement {
     //When a break statement is encountered inside a loop,
    //the loop is immediately terminated and the program control
    //resumes at the next statement following the loop.

    public static void main(String[] args) {
        System.out.println("break in for loop");
        for (int i=1;i<=9;i++) {
            if (i==5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n");
        System.out.println("break in nested for");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break;
                }
                System.out.println(i+" "+j);
            }
        }



    }
}
