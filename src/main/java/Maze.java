public class Maze {

    int x;
    int y;

    public Maze(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean canMove(int newX, int newY) {

        return x >= 0 && y >= 0 && newX <= x && newY <= y;
    }
}
