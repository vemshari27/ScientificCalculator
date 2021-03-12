import iiitb.org.ScientificCalculator.entities.NormalCalculator;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NCalTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing normal calculator");
    }

    @After
    public void tearDown(){
        System.out.println("Done testing.");
    }

    @Parameterized.Parameter(0)
    public String x;
    @Parameterized.Parameter(1)
    public double result;
    @Parameterized.Parameter(2)
    public String message;
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] d = new Object[][] {
                {"4*2.5+8.5+1.5/3.0",19,"Should treat dot separated floating point numbers as a valid input"},
                {"5.0005+0.0095",5.01,"Should give precise answer upto 4 decimal points."},
                {"2*3-4*5+6/3.5",-12.2858,"Should calculate long, mixed additive and multiplicative expressions from left to right"}
        };
        return Arrays.asList(d);
    }

    @Test
    public void goodTest() {
        NormalCalculator ncal = new NormalCalculator(0);
        System.out.println("Good test cases.");
        assertEquals(message,result,ncal.compute_expression(x),0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void badTest() {
        NormalCalculator ncal = new NormalCalculator(0);
        System.out.println("0/0 Test");
        ncal.compute_expression("0/0");
    }
}
