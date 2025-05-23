import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorial_Zero() {
        // Arrange & Act
        int result = Factorial.factorial(0);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void testFactorial_One() {
        // Arrange & Act
        int result = Factorial.factorial(1);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void testFactorial_SmallNumber() {
        // Arrange & Act
        int result = Factorial.factorial(5);

        // Assert
        assertEquals(120, result);  // 5! = 5 × 4 × 3 × 2 × 1 = 120
    }

    @Test
    void testFactorial_LargeNumber() {
        // Arrange & Act
        int result = Factorial.factorial(7);

        // Assert
        assertEquals(5040, result);  // 7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040
    }

    @Test
    void testFactorial_NegativeNumber_ShouldThrowException() {
        // Arrange & Act & Assert
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-3));
    }
}
