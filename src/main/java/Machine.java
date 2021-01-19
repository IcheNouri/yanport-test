import enums.EDirection;
import enums.EInstruction;
import utils.Position;

public class Machine {

    Position position;
    EDirection direction;
    Maze maze;

    public Machine(Position position, EDirection direction) {
        this.position = position;
        this.direction = direction;
    }

    public void instruct(EInstruction instruction) {

        switch (instruction) {
            case D:
                setDirection(this.direction.next());
                break;
            case G:
                setDirection(this.direction.prev());
                break;
            case A:
                move();
                break;
        }

    }

    private void move() {

        int newX = position.getX() + direction.getNextPOI().getX();
        int newY = position.getY() + direction.getNextPOI().getY();
        boolean canMove = maze.canMove(newX, newY);

        if (canMove) {
            this.position = new Position(newX, newY);
        }
    }


    private void setDirection(EDirection direction) {
        this.direction = direction;
    }

    public void setMaze(Maze maze) {
        this.maze = maze;
    }

    public String printPosition() {
        return "x=" + position.getX() + " y=" + position.getY() + " orientation=" + direction;
    }
}
