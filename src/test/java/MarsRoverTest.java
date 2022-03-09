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
        assertEquals(1, new MarsRover(3,3,"N").MoveForward());
        assertEquals(1, new MarsRover(2,2,"E").MoveForward());
        assertEquals(0, new MarsRover(2,1,"S").MoveForward());
        assertEquals(0, new MarsRover(1,5,"W").MoveForward());
    }

    @Test
    public void testOnRoverRotating() {
        assertEquals(1, new MarsRover(1,1,"E").RoverRotate('L'));
        assertEquals(1, new MarsRover(1,1,"N").RoverRotate('R'));
        assertEquals(0, new MarsRover(1,1,"S").RoverRotate('L'));
        assertEquals(0, new MarsRover(1,1,"W").RoverRotate('R'));
    }
}
