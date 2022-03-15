import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MarsRoverTest {

    @Test
    public void testErrorOnFaultyDirection() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new MarsRover(1,1,"V"));
        assertEquals("Only N,E,S,W directions allowed", exception.getMessage());
    }

    @Test
    public void testErrorOnNullDirection() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new MarsRover(1,1,null));
        assertEquals("Only N,E,S,W directions allowed", exception.getMessage());
    }

    @Test
    public void testErrorOnFaultyCords() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new MarsRover(8,1,"E"));
        assertEquals("Only numbers between 0-6 allowed", exception.getMessage());
    }

    @Test
    public void testOnMoving() {
        assertEquals("3:5:E", new MarsRover(3,3,"W").Move("brffrb"));
        assertEquals("5:1:N", new MarsRover(5,1,"S").Move("rr"));
        assertEquals("3:4:E", new MarsRover(2,5,"W").Move("bbllffrfrbbbbllfff"));
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new MarsRover(3,3,"W").Move("brffpb"));
        assertEquals("Illegal command inserted!", exception.getMessage());
    }
    /*
    @Test
    public void testOnRoverRotating() {
        assertEquals(1, new MarsRover(1,1,"E").RoverRotate('L'));
        assertEquals(1, new MarsRover(1,1,"N").RoverRotate('R'));
        assertEquals(0, new MarsRover(1,1,"S").RoverRotate('L'));
        assertEquals(0, new MarsRover(1,1,"W").RoverRotate('R'));

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new MarsRover(3,2,"E").RoverRotate('H'));
        assertEquals("Only L,R rotations allowed", exception.getMessage());
    }
     */
}
