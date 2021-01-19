import enums.EDirection;
import enums.EInstruction;
import org.junit.Test;
import utils.Position;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test1() {

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

        assertEquals("x=5 y=6 orientation=N", machine.printPosition());
    }

    @Test
    public void test2() {

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
                add(EInstruction.A);
                add(EInstruction.A);
                add(EInstruction.A);
                add(EInstruction.A);
                add(EInstruction.A);
                add(EInstruction.A);
            }
        };

        for (EInstruction instruction : instructions) {
            machine.instruct(instruction);
        }

        machine.printPosition();

        assertEquals("x=5 y=10 orientation=N", machine.printPosition());
    }

}
