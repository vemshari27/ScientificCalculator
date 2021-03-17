import iiitb.org.ScientificCalculator.entities.ScientificCalculator;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SCalLogTest {
    private static Random random;
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing for logarithm feature.");
        random = new Random();
    }

    @After
    public void tearDown(){
        System.out.println("Done testing.");
    }

    @Test
    public void positiveLogTest() {
        System.out.println("Testing for a non negative no.");
        ScientificCalculator scal = new ScientificCalculator(0);
        double ans = scal.ln(5);
        assertEquals(ans, 1.60943791243,0.001);
        ans = scal.ln(1);
        assertEquals(ans, 0,0);
    }

    @Test(expected = ArithmeticException.class)
    public void non_positiveLogTest() {
        System.out.println("Testing for a negative root.");
        ScientificCalculator scal = new ScientificCalculator(0);
        scal.ln(0);
    }

    @Test(expected = ArithmeticException.class)
    public void non_positiveLogTest1() {
        System.out.println("Testing for a negative root.");
        ScientificCalculator scal = new ScientificCalculator(0);
        scal.ln(-5);
    }
}
