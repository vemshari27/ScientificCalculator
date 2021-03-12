import iiitb.org.ScientificCalculator.ScientificCalculator;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SCalComputeTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing compute expression calculator");
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
                {"4*2.5+8.5+1.5/3.0",19,"Non-complex: Should treat dot separated floating point numbers as a valid input"},
                {"5.0005+0.0095",5.01,"Non-complex: Should give precise answer upto 4 decimal points."},
                {"2*3-4*5+6/3.5",-12.2858,"Non-complex: Should calculate long, mixed additive and multiplicative expressions from left to right"},
                {"(2)+(17*2-30)*(5)+2-(8/2)*4",8,"Complex: (2)+(17*2-30)*(5)+2-(8/2)*4"},
                {"(5*7/5)+(23)-5*(98-4)/(6*9-42)",-9.16666666, "Complex: (5*7/5)+(23)-5*(98-4)/(6*9-42)"},
                {"((((2.0+8/log(5))+-4^(2)))/((5!)))",-0.07524433769602587, "Complex: ((((2!+8/ln(5))+-4^(2)))/((5!))"},
                {"(sqrt(4))+(17*4!-log(30))*(5)+2!-(2^(3))*4",1994.9940130916893, "Complex: (sqrt(4))+(17*4!-ln(30))*(5)+2!-(2^(3))*4"}
        };
        return Arrays.asList(d);
    }

    @Test
    public void goodTest() {
        ScientificCalculator scal = new ScientificCalculator(0);
        System.out.println("Good test cases.");
        assertEquals(message,result,scal.compute_expression(x),0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void badTest() {
        ScientificCalculator scal = new ScientificCalculator(0);
        System.out.println("0/0 Test");
        scal.compute_expression("0/0");
    }
}
