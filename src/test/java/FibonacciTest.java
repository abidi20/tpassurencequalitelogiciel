import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFibonacci_Zero() {
        // Arrange & Act
        int result = Fibonacci.fibonacci(0);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void testFibonacci_One() {
        // Arrange & Act
        int result = Fibonacci.fibonacci(1);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void testFibonacci_SmallNumber() {
        // Arrange & Act
        int result = Fibonacci.fibonacci(5);

        // Assert
        assertEquals(5, result);  // Car fib(5) = 5
    }

    @Test
    void testFibonacci_LargerNumber() {
        // Arrange & Act
        int result = Fibonacci.fibonacci(10);

        // Assert
        assertEquals(55, result);  // Car fib(10) = 55
    }

    @Test
    void testFibonacci_NegativeNumber_ShouldThrowException() {
        // Arrange & Act & Assert
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
}
