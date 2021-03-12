import iiitb.org.ScientificCalculator.ScientificCalculator;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SCalFactorialTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing for factorial feature.");
    }

    @After
    public void tearDown(){
        System.out.println("Done testing.");
    }

    @Parameter(0)
    public double x;
    @Parameter(1)
    public double result;
    @Parameter(2)
    public String message;
    @Parameters
    public static Collection<Object[]> data(){
        Object[][] d = new Object[][] {{5,120,"Factorial of a natural no."},{4.43,24,"Factorial of a decimal."},{0,1,"Factorial of 0"}};
        return Arrays.asList(d);
    }

    @Test
    public void non_negativeTest() {
        ScientificCalculator scal = new ScientificCalculator(0);
        System.out.println("Factorial of a non negative no.");
        assertEquals(message,result,scal.factorial(x),0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void negativeTest() {
        ScientificCalculator scal = new ScientificCalculator(0);
        System.out.println("Factorial of a negative no.");
        scal.factorial(-5);
    }
}
