import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testIsPrime_WhenNegativeNumber() {
        // Arrange & Act
        boolean result = Prime.isPrime(-5);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsPrime_WhenZero() {
        // Arrange & Act
        boolean result = Prime.isPrime(0);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsPrime_WhenOne() {
        // Arrange & Act
        boolean result = Prime.isPrime(1);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsPrime_WhenTwo() {
        // Arrange & Act
        boolean result = Prime.isPrime(2);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPrime_WhenThree() {
        // Arrange & Act
        boolean result = Prime.isPrime(3);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPrime_WhenPrimeNumber() {
        // Arrange & Act
        boolean result = Prime.isPrime(17);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPrime_WhenCompositeNumber() {
        // Arrange & Act
        boolean result = Prime.isPrime(18);

        // Assert
        assertFalse(result);
    }
}
