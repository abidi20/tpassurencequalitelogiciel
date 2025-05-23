import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;

    @BeforeEach
    void soundous() {
        stack = new Stack(); // Initialise une nouvelle pile avant chaque test
    }

    @Test
    void testPushAndPeek() {
        // Act
        stack.push(10);
        stack.push(20);
        int topElement = stack.peek();

        // Assert
        assertEquals(20, topElement);
    }

    @Test
    void testPop() {
        // Arrange
        stack.push(5);
        stack.push(15);

        // Act
        int poppedElement = stack.pop();

        // Assert
        assertEquals(15, poppedElement);
        assertEquals(1, stack.size());
    }

    @Test
    void testIsEmpty_WhenNewStack() {
        // Act & Assert
        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmpty_AfterPush() {
        // Act
        stack.push(30);

        // Assert
        assertFalse(stack.isEmpty());
    }

    @Test
    void testSize() {
        // Arrange
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Act
        int size = stack.size();

        // Assert
        assertEquals(3, size);
    }

    @Test
    void testPop_ThrowsException_WhenEmpty() {
        // Act & Assert
        assertThrows(IllegalStateException.class, stack::pop);
    }
}
