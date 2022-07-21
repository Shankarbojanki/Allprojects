package Practceall;

public class Forloop {
//    The Java for loop is used to iterate a part of the program several times.
//    If the number of iteration is fixed, it is recommended to use for loop.
    public static void main(String[] args) {
        int i;
        System.out.print("i values: ");
        for (i=1;i<=10;i++) {

            System.out.print(i +" ");

        }

        System.out.println("\n");
        System.out.print("j values: ");
        for (int j=1;j<=15;j++) {
            System.out.print(j + " ");
        }
        //nested for
        System.out.println("\n");
        System.out.println("nested for");
        for (int k=1;k<=3;k++) {
            for (int l=1;l<=3;l++) {
                System.out.println(k+" " +l);
            }
        }

        System.out.println("star pattern");
        for (int a=1;a<=5;a++) {
            for (int b=1;b<=a;b++){
                System.out.print("* ");
                System.out.print(a);
            }
            System.out.println();
        }

        System.out.println("reverse star pattern");
        for (int a=1;a<=5;a++) {
            for (int b=5;b>=a;b--){
                System.out.print("* ");
                System.out.print(a);
            }
            System.out.println();
        }
            //for each
        int array[] = {3,7,9,2,5,1,4};
        System.out.println("for each loop:");

        for(int arr:array) {
            System.out.print(arr+" ");
        }
        //labelled for loop
        System.out.println("labelled for loop for break and continue in nested for loop");
        loopa:
        for (int A=1;A<=3;A++) {
            System.out.print(A);
            loopb:
            for (int B=1;B<=3;B++){
                System.out.println(A+" "+B);
                if (A==2&&B==2){
                    break loopa;
                }
            }
        }
    }
}
