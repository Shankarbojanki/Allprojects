package BoardGame;


class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Board {
    int rows;
    int cols;
    int[][] board;
    Point point;
    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new int[rows][cols];
    }

    public void addPoint(Point point) {
        this.board[point.x-1][point.y-1] = 1;
        this.point = point;
    };

    public void goLeft() {
        this.move(0, -1);
    }

    public void goRight() {
        this.move(0, 1);
    }
    public void goUp() {
        this.move(-1, 0);
    }
    public void goDown() {
        this.move(1, 0);
    }
    public boolean isValidPoint(Point point) {
        if (point.x < 0 || point.x > this.rows-1 || point.y < 0 || point.y > this.cols-1) {
            return false;
        }
        return true;
    }
    public void move(int dx, int dy) {
        Point currentPoint = this.point;
        Point NextPoint = new Point(currentPoint.x + dx, currentPoint.y + dy);
        if (this.isValidPoint(NextPoint)) {
            this.board[NextPoint.x-1][NextPoint.y-1] = 1;
            this.point = NextPoint;
        }
    }
    public void printBoard() {
        System.out.println("Board state:");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.board[i][j]);
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Board board = new Board(5, 5);
        board.addPoint(new Point(1, 1));
        board.printBoard();
        board.goRight();
        board.goRight();
        board.printBoard();
        board.goDown();
        board.printBoard();
    }
}
