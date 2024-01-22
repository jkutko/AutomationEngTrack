import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test

    public void addTest(){
        int a = 5;
        int b = 8;
        int expectedResult = 13;
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result);

    }
    @Test
    public  void multiTest(){
        int c = 12;
        int d = 4;
        int expectedResult = 48;
        Calculator calculator = new Calculator();
        int result = calculator.multi(c, d);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public  void divideTest(){
        int c = 12;
        int d = 4;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int result = calculator.divide(c, d);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public  void removeTest(){
        int c = 12;
        int d = 4;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int result = calculator.remove(c, d);
        Assert.assertEquals(expectedResult, result);
    }

}
