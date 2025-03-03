package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    // Test creating a valid Contact with correct values
    @Test
    void testValidContactCreation() {
        // Create a new Contact object with valid data
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        
        // Verify that the values match the expected values
        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    // Test creating a Contact with invalid contact ID (null or too long)
    @Test
    void testInvalidContactId() {
        // Test invalid contact ID, it should throw an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "John", "Doe", "1234567890", "123 Main St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St"));
    }

    // Test using setters with valid data
    @Test
    void testSettersWithValidData() {
        // Create a new Contact object with valid data
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");

        // Update contact details using setters
        contact.setFirstName("Mike");
        contact.setLastName("Smith");
        contact.setPhone("0987654321");
        contact.setAddress("456 Elm St");

        // Verify that the updated values match the new ones
        assertEquals("Mike", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("0987654321", contact.getPhone());
        assertEquals("456 Elm St", contact.getAddress());
    }

    // Test using setters with invalid data
    @Test
    void testSettersWithInvalidData() {
        // Create a new Contact object with valid data
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");

        // Test invalid data for each setter, expect IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName("NameTooLong123"));
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("abc123"));
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress("This address is too long and invalid."));
    }
}

