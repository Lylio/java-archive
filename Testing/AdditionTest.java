import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void add() {
        assertEquals("Add Positive Integers", 7, Addition.add(4,3));
    }
}