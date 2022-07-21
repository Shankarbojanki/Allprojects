package Begin.VehicleInSurance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your vehicle type");
        System.out.println("car,truck,bus,motorcycle");
        Scanner scan=new Scanner(System.in);
        String type= scan.nextLine();
        int premium=0;
        switch (type) {
            case "car" :
                premium=200;
                break;
            case"truck":
                premium=300;
                break;
            case"bus":
                premium=400;
                break;
            case"motorcycle":
                System.out.println("Enter your motorcycle type");
                System.out.println("1.Low\n2.Medium\n3.Large");
                String motorCycleType= scan.nextLine();
                int motorcycleInt=Integer.parseInt(motorCycleType);
                switch (motorcycleInt){
                    case 1:
                        premium =300;
                        break;
                    case 2:
                        premium=500;
                        break;
                    case 3:
                        premium=750;
                        break;
                    default:
                        System.out.println("Enter valid Motorcycle type");

                }
                break;
            default:
                System.out.println("Wrong input");
        }
        scan.close();
        System.out.println("The premium is : " +premium);
    }
}
