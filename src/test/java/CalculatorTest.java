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
    public void factOne() {
        assertEquals("testcase 1", 120, calculator.fact(5));
        ;
    }

    @Test
    public void factTwo() {
        assertFalse("testcase 2", 120 == calculator.fact(6));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void factNegatve() {
        long f = -1;
        calculator.fact(-1);
    }

    @Test
    public void power() {
        assertTrue("testcase 3", 16 == calculator.power(4, 2));
        ;
    }

    @Test
    public void log()
    {
        assertTrue("testcase 4", 0.6931471805599453 == calculator.log(2));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void logNegatve() {
        long f = -1;
        calculator.log(-1);
    }

    @Test
    public void sqrt()
    {
        assertTrue("testcase 4", 4.0 == calculator.sqrt(16));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void sqrtNegatve() {
        long f = -1;
        calculator.sqrt(-1);
    }





}