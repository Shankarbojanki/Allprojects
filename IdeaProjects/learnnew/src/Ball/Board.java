package Ball;

import java.util.ArrayList;

public class Board {

    int width;
    int height;
    public ArrayList<Ball> balls= new ArrayList<Ball>();

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addBall(Ball ball) {
        this.balls.add(ball);
    }

    public void animate() {
        for(Ball ball: this.balls) {
            ball.shake();
        }
    }
}

