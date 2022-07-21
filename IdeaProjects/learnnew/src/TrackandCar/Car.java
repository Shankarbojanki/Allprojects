package TrackandCar;

import java.util.ArrayList;

public class Car {
    int x;
    Driver driver;
    String name;
    public Car(String name) {
        this.x = 0;
        this.name = name;
        this.driver = null;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void move(int distance){
        this.x = this.x + distance;
    }
}


//
//public class Car {
//    int num;
//    int speed;
//    private Driver[]
//            driver;
//    ArrayList<Driver> drivers=new ArrayList<Driver>();
//    private Object driver1;
//
//    public Car(int num, int speed) {
//        this.speed = speed;
//        this.num = num;
//    }
//    public int getSpeed() {
//        return speed;
//    }
//    public int getNum(){
//        return num;
//    }
//    public void addDriver (Driver driver){
//        this.drivers.add(driver);
//    }
//    public void drives(){
//        for (Driver driver:this.driver){
//            driver.drive();
//        }
//    }
//    public void move(int length) {
//        if (Driver.name==null) {
//            System.out.println(" if you want to start the race add each driver per car");
//
//        }
//        else {
//            while (speed >= 100) {
//
//            }
//            System.out.println("carnumber:" + num+",speed:"+speed);
//
//        }
//    }
//}