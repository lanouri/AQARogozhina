import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();

        // Проверяем факториал числа 0
        Assert.assertEquals(calculator.calculateFactorial(0), 1);

        // Проверяем факториал числа 5
        Assert.assertEquals(calculator.calculateFactorial(5), 120);
    }
}