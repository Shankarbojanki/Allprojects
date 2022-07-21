package collections.intro;

public class Main {

      public static void main (String[] args) {
            Theatre theatre = new Theatre("Rama talkies",8,12);
            theatre.getSeats();
            if(theatre.reserveSeat("A01")){
                  System.out.println("please pay");
            }
            else {
                  System.out.println("sorry seat is taken");
            }
            if(theatre.reserveSeat("A01")){
                  System.out.println("please pay");
            }
            else {
                  System.out.println("sorry seat is taken");
            }
      }
}



