package Ball;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Board board = new Board(100, 100);
        Ball ball1 = new Ball(12, 34, 18);
        Ball ball2 = new Ball(39, 42, 13);
        Ball ball3 = new Ball(45,67,9);
        board.addBall(ball1);
        board.addBall(ball2);
        board.addBall(ball3);
        board.animate();
    }
}
