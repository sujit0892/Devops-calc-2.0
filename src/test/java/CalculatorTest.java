import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void factTruePositive() {
        assertEquals("testcase 1", 120, calculator.fact(5));
        ;
    }

    @Test
    public void factFalsePositive() {
        assertFalse("testcase 2", 120 == calculator.fact(6));
        ;
    }

    @Test(expected = ArithmeticException.class)
    public void factError() {
        long f = -1;
        calculator.fact(-1);
    }

    @Test
    public void powerTruePositive() {
        assertTrue("testcase 3", 16 == calculator.power(4, 2));
        ;
    }

    @Test
    public void powerFalsePositive() {
        assertFalse("testcase 4", 16 == calculator.power(8, 2));
        ;
    }

    @Test
    public void logTruePositive()
    {
        assertTrue("testcase 5", 0.6931471805599453 == calculator.log(2));
        ;
    }

    @Test
    public void logFalsePositive()
    {
        assertFalse("testcase 6", 0.6931499453 == calculator.log(68));
        ;
    }

    @Test(expected = ArithmeticException.class)
    public void logError() {
        long f = -1;
        calculator.log(-1);
    }

    @Test
    public void sqrtTruePositive()
    {
        assertTrue("testcase 7", 4.0 == calculator.sqrt(16));
        ;
    }

    @Test
    public void sqrtFalsePositive()
    {
        assertFalse("testcase 8", 4.0 == calculator.sqrt(96));
        ;
    }

    @Test(expected = ArithmeticException.class)
    public void sqrtError() {
        long f = -1;
        calculator.sqrt(-1);
    }





}