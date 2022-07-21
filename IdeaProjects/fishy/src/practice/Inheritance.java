package practice;

 class Inheritance {
    //bicycle
    protected int gear;
    protected int speed;
          //constructor
    public Inheritance(int startSpeed, int startGear){
        gear =startGear;
        speed =startSpeed;
    }
         //setters set
     public void setGear(int newValue) {
        gear = newValue;
    }
    public void applyBrake (int decrement) {
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
}
