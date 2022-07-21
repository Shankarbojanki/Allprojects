package Begin.Budget;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How much can you spend");
        Scanner scan =new Scanner(System.in);
        double total=scan.nextDouble();
        double sum=0;
        int i =0;
        ArrayList<Double> proportion =new ArrayList<Double>();
        System.out.println("Enter your proportion of various expenses");
        System.out.println("stops if exceeds 100%");

        do {
            System.out.println("your proportion of  expenses " +(i+1) + ":");
            double value = scan.nextDouble();
            proportion.add(value);
            sum += proportion.get(i);
            i++;
        }while (sum<=1000);
        scan.close();
        if (sum>1000) {
            double cumulativeSum =0.0;
            for (int j=0; j< proportion.size()-1;j++) {
                cumulativeSum += proportion.get(j);
            }
            proportion.set(proportion.size()-1,1000.0 -cumulativeSum );
        }
        for (double value:proportion) {
            double expense =value*total/100.0;
            System.out.println("ur" +value + "% equals  Rs " +expense);
        }
    }
}
