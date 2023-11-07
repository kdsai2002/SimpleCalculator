import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
    private Main calculator;
    @Before
    public void setUp() {
        calculator = new Main();
    }
    @Test
    public void test_add() {
        int a = 4;
        int aa = 6;
        int expectedResult = 10;
        int result = calculator.add(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_subt() {
        int a = 3;
        int aa = 2;
        int expectedResult = 1;
        int result = calculator.subt(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_mul() {
        int a = 4;
        int aa = 2;
        int expectedResult = 8;
        int result = calculator.mul(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_per() {
        int a = 1;
        int b = 5;
        int expectedResult = 1;
        int result = calculator.per(a,b);
        Assert.assertEquals(expectedResult, result);
    }
}