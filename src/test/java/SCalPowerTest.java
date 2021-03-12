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
public class SCalPowerTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing for power feature.");
    }

    @After
    public void tearDown(){
        System.out.println("Done testing.");
    }

    @Parameterized.Parameter(0)
    public double x;
    @Parameterized.Parameter(1)
    public double y;
    @Parameterized.Parameter(2)
    public double result;
    @Parameterized.Parameter(3)
    public String message;
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] d = new Object[][] {{2,5,32,"2^5"},{-5,2,25,"-5^2"},{2,6.5,64,"2^6.5"},{4.43,2,19.62489,"4.43^2"},{0,1.9,0,"0^1.9"},{91.23,0,1,"91.23^0"}};
        return Arrays.asList(d);
    }

    @Test
    public void goodTest() {
        ScientificCalculator scal = new ScientificCalculator(0);
        System.out.println("Not 0^0");
        assertEquals(message,result,scal.power(x,y),0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void negativeTest() {
        ScientificCalculator scal = new ScientificCalculator(0);
        System.out.println("Testing 0^0");
        scal.power(0,0);
    }
}
