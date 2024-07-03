import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        long result = FactorialCalculator.calculateFactorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        long result = FactorialCalculator.calculateFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        try {
            FactorialCalculator.calculateFactorial(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("Factorial is not defined for negative numbers", e.getMessage());
        }
    }
}