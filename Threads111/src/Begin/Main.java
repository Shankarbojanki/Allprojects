package Begin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter buying price:");
        double buyingPrice = scan.nextDouble();
        double closingPrice=0.1;
        int day=1;

        while (true) {
            System.out.println("Enter closing price Day:" +day);
            closingPrice=scan.nextDouble();
            if (closingPrice<0.0) break;
            double earnings =closingPrice-buyingPrice;
            if (earnings>0.0) {
                System.out.println("After day " +day +"  your earnings " +earnings +" per share");
            } else if (earnings<0.0) {
                System.out.println("After day " +day +"  your lost " + (-earnings )+" per share");
            } else {
                System.out.println("After day " +day + ", you have " +"no earnings per share");
            }
            day +=1;
        }
        scan.close();
    }
}
