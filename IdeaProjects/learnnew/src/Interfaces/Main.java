package Interfaces;

import java.util.ArrayList;
import java.util.Scanner;
interface  Bank {
    void account();
}

   class SBIAccount implements Bank {
        ArrayList <SBIAccount> sbiarray = new ArrayList<>();
         String name;
         String gender;
         int dateofbirth;

       SBIAccount (String name,String gender,int dateofbirth){
           this.name = name;
           this.gender = gender;
           this.dateofbirth = dateofbirth;
       }

       @Override
       public String toString() {
           return "SBIAccount:" + "name=" + name  + ", gender='" + gender  + ", dateofbirth=" + dateofbirth;
       }

       SBIAccount()
         {
         }
      public void account(){
          Scanner sbi = new Scanner(System.in);
          System.out.println("enter your name");
          String name =sbi.nextLine();
          System.out.println("enter your gender (M/F)");
          String gender = sbi.nextLine();
          System.out.println("enter you date of birth");
          int dateofbirth = sbi.nextInt();
          System.out.println("Name: "+name+", Gender:"+gender+",  Date:"+dateofbirth);
          sbiarray.add(new SBIAccount(name,gender,dateofbirth));
          System.out.println(sbiarray.toString());
      }
  }
 class ICICIAccount implements Bank {
     ArrayList <ICICIAccount> iciciarray = new ArrayList<>();
     String firstname;
     String lastname;
     String gender;
     int dateofbirth;

     ICICIAccount (String firstname, String lastname,String gender,int dateofbirth){
         this.firstname = firstname;
         this.lastname = lastname;
         this.gender = gender;
         this.dateofbirth = dateofbirth;
     }

     @Override
     public String toString() {
         return "ICICIAccount:" + "firstname=" + firstname + ", lastname: "+lastname  + ", gender='" + gender +  ", dateofbirth=" + dateofbirth;
     }

     ICICIAccount()
     {
     }
      public void account(){
          Scanner icici  = new Scanner(System.in);
          System.out.println("enter your first name");
          String firstname =icici.nextLine();
          System.out.println("enter your last name");
          String lastname =icici.nextLine();
          System.out.println("enter your gender (M/F)");
          String gender = icici.nextLine();
          System.out.println("enter you date of birth");
          int dateofbirth = icici.nextInt();
          System.out.println("firstName: "+firstname+"Lastname: "+lastname+", Gender:"+gender+",  Date:"+dateofbirth);
          iciciarray.add(new ICICIAccount(firstname,lastname,gender,dateofbirth));
          System.out.println(iciciarray.toString());

      }
}
public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int Bankoptionmenu;
        do {
            System.out.println("Select your Bank");
            System.out.println("1.SBI");
            System.out.println("2.ICICI");
            System.out.println("3.close");
            Bankoptionmenu = menu.nextInt();

            switch (Bankoptionmenu) {
                case 1: {
                    Bank sbi = new SBIAccount();
                    sbi.account();
                    break;
                }
                case 2: {
                    Bank icici = new ICICIAccount();
                    icici.account();
                }
            }
        }
            while (Bankoptionmenu != 3) ;

    }
}
