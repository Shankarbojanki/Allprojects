package TrackandCar;

public class Main {
    public static void main(String[] args) {
        Track track =new Track(100);
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");
        carA.setDriver(new Driver("A driver"));
        carB.setDriver(new Driver("B driver"));
        carC.setDriver(new Driver("C driver"));
        track.addCar(carA);
        track.addCar(carB);
        track.addCar(carC);
        track.startRace();
    }
}
