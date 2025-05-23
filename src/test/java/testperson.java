import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class testperson {

    @Test
    void testGetFullName() {
        // Arrange
        Person person = new Person("John", "Doe", 25);

        // Act
        String fullName = person.getFullName();

        // Assert
        assertEquals("John Doe", fullName);
    }

    @Test
    void testIsAdult_WhenAgeIs18OrMore() {
        // Arrange
        Person adultPerson = new Person("Alice", "Smith", 18);

        // Act
        boolean isAdult = adultPerson.isAdult();

        // Assert
        assertTrue(isAdult);
    }

    @Test
    void testIsAdult_WhenAgeIsLessThan18() {
        // Arrange
        Person youngPerson = new Person("Bob", "Brown", 17);

        // Act
        boolean isAdult = youngPerson.isAdult();

        // Assert
        assertFalse(isAdult);
    }
    @Test

    void testIsAdult_WhenAgeequal18() {
        // Arrange
        Person youngPerson = new Person("Bob", "Brown", 18);

        // Act
        boolean isAdult = youngPerson.isAdult();

        // Assert
        assertTrue(isAdult);
    }
}
