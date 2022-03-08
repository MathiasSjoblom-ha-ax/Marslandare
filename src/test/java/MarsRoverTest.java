import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MarsRoverTest {

    @Test
    public void testErrorOnFaultyDirection() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new MarsRover(1,1,"V"));
        assertEquals("Only N,W,S,E directions allowed", exception.getMessage());
    }

}
