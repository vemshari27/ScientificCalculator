import iiitb.org.ScientificCalculator.entities.ScientificCalculator;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SCalSqrtTest {
    private static Random random;
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing for square root feature.");
        random = new Random();
    }

    @After
    public void tearDown(){
        System.out.println("Done testing.");
    }

    @Test
    public void perfectSquare() {
        System.out.println("Testing for a perfect square's root.");
        ScientificCalculator scal = new ScientificCalculator(0);
        int random_num = random.nextInt(100);
        double ans = scal.squareRoot(random_num*random_num);
        assertEquals(ans, random_num,0);
    }

    @Test
    public void non_perfectSquare() {
        System.out.println("Testing for a non perfect square's root.");
        ScientificCalculator scal = new ScientificCalculator(0);
        double ans = scal.squareRoot(5);
        assertEquals(ans, 2.2360679775,0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void negativeSquare() {
        System.out.println("Testing for a negative root.");
        ScientificCalculator scal = new ScientificCalculator(0);
        double ans = scal.squareRoot(-5);
    }
}
