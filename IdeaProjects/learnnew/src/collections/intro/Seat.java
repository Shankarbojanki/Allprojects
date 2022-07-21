package collections.intro;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;

public class Seat {
    private final String seatNumber;
    private boolean reserved = false;
     
    public Seat(String seatNumber){
        this.seatNumber=seatNumber;
    }
    public boolean reserve(){
        if(!this.reserved){
            this.reserved=true;
            System.out.println("Seat  "+ seatNumber + "   reserved," );
            DateTimeFormatter cdt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime seatbooking = LocalDateTime.now();
            System.out.println(cdt.format(seatbooking));
            return true;
        }else{
            return false;
        }
    }
    public boolean cancel(){
        if(this.reserved){
            this.reserved =false;
            System.out.println("Reservation of seat " + seatNumber + "cancelled");
            return true;
        }else{
            return false;
        }
    }
    public String getSeatNumber(){
        return seatNumber;
    }
}
