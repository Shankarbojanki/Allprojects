package practice;

 class MountainBike extends Inheritance {
     public int seatHeight;
      //constructor
     public MountainBike(int startHeight,
                         int startSpeed,
                         int startGear){
         //super method
         super(startSpeed,startGear);
         this.seatHeight = startHeight;
     }

     public void setHeight (int newValue){
         seatHeight = newValue;

     }
}
