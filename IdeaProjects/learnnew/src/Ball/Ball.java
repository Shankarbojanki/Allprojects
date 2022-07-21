package Ball;
public class Ball {
    int x;
    int y;
    int radius;
    public Ball(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void shake() {
        System.out.println("shaking the ball"+x+":"+y);
    }
}
