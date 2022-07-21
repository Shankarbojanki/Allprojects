package Begin.Timeadder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter current time in Hours");
        int currentHour= scan.nextInt();
        System.out.println("Enter current time in Minutes");
        int currentMinute= scan.nextInt();
        System.out.println("Enter current time in seconds");
        int currentSeconds= scan.nextInt();
        System.out.println("Enter forward time in Hours");
        int forwardHours= scan.nextInt();
        System.out.println("Enter forward time in minutes");
        int forwardMinutes= scan.nextInt();
        System.out.println("Enter forward time in Seconds");
        int forwardSeconds= scan.nextInt();


        int answerHour=0;
        int answerMinute=0;
        int answerSecond=0;

        int carrySecond=0;
        int carryMinute=0;

        boolean isNextday=false;

         answerSecond=currentSeconds+forwardSeconds;
        if (answerSecond>=60) {
            answerSecond-=60;
            carrySecond=1;
        }
        answerMinute=currentMinute+forwardMinutes+carrySecond;
        if (answerMinute>=60) {
            answerMinute-=60;
            carryMinute=1;
        }
        answerHour=currentHour+forwardHours+carryMinute;
        if (answerHour>=24) {
            answerHour-=24;
            isNextday =true;
        }
        if (isNextday) {
            System.out.println("The answer is:" +answerHour+ ":" +answerMinute +":"+answerSecond +"  on the next day");
        }
        else {
            System.out.println("The answer is:" +answerHour+ ":" +answerMinute +":"+answerSecond );
        }
    }
}
