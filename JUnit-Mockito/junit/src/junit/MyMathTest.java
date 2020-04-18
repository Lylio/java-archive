package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyMathTest {
    Logger logger = Logger.getLogger(MyMathTest.class.getName());
    MyMath myMath = new MyMath();

    @Test
    public void sumWith3Numbers() {
        logger.log(Level.INFO, "Test 1");
        assertEquals(6, myMath.mySum(new int[]{1, 2, 3}));
    }

    @Test
    public void sumWith1Number() {
        logger.log(Level.INFO, "Test 2");
        assertEquals(8, myMath.mySum(new int[]{8}));
    }

    @Test
    public void sumWithZeroNumbers() {
        logger.log(Level.INFO, "Test 3");
        assertEquals(0, myMath.mySum(new int[]{}));
    }
}

