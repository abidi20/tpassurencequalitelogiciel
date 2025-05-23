import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    void testSetWithInvalidIndices() {
        Matrix m = new Matrix(3);
        assertThrows(IndexOutOfBoundsException.class, () -> m.set(-1, 1, 10));
        assertThrows(IndexOutOfBoundsException.class, () -> m.set(1, 3, 10));
    }

    @Test
    void testGetWithInvalidIndices() {
        Matrix m = new Matrix(2);
        assertThrows(IndexOutOfBoundsException.class, () -> m.get(2, 0));
        assertThrows(IndexOutOfBoundsException.class, () -> m.get(0, -1));
    }

    @Test
    void testConstructorWithZeroSizeShouldFail() {
        assertThrows(IllegalArgumentException.class, () -> new Matrix(0));
    }

    @Test
    void testMultiplyWithNullShouldThrow() {
        Matrix m = new Matrix(2);
        assertThrows(NullPointerException.class, () -> m.multiply(null));
    }

    @Test
    void testAddWithDifferentSizeShouldThrow() {
        Matrix m1 = new Matrix(2);
        Matrix m2 = new Matrix(3);
        assertThrows(IllegalArgumentException.class, () -> m1.add(m2));
    }

    @Test
    void testMultiplyResultCorrect() {
        Matrix m1 = new Matrix(2);
        Matrix m2 = new Matrix(2);
        m1.set(0, 0, 1); m1.set(0, 1, 2);
        m1.set(1, 0, 3); m1.set(1, 1, 4);

        m2.set(0, 0, 2); m2.set(0, 1, 0);
        m2.set(1, 0, 1); m2.set(1, 1, 2);

        m1.multiply(m2);

        assertEquals(4, m1.get(0, 0));
        assertEquals(4, m1.get(0, 1));
        assertEquals(10, m1.get(1, 0));
        assertEquals(8, m1.get(1, 1));
    }
}
