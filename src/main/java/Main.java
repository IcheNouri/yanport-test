import enums.EDirection;
import enums.EInstruction;
import utils.Position;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Maze maze = new Maze(10, 10);
        Machine machine = new Machine(new Position(5, 5), EDirection.N);
        machine.setMaze(maze);

        List<EInstruction> instructions = new ArrayList<EInstruction>() {
            {
                add(EInstruction.D);
                add(EInstruction.A);
                add(EInstruction.D);
                add(EInstruction.A);
                add(EInstruction.D);
                add(EInstruction.A);
                add(EInstruction.D);
                add(EInstruction.A);
                add(EInstruction.A);
            }
        };


        for (EInstruction instruction : instructions) {
            machine.instruct(instruction);
        }

        machine.printPosition();
    }
}
