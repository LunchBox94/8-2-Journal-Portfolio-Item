package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    private ContactService contactService;

    // This method runs before each test to set up a new ContactService.
    @BeforeEach
    void setUp() {
        // Initialize the contact service before each test.
        contactService = new ContactService();
    }

    // Test the addContact method to ensure that a contact is added successfully
    @Test
    void testAddContact() {
        // Create a new contact with unique ID and valid fields
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        // Add the contact to the contact service
        contactService.addContact(contact);
        // Verify that there is one contact in the service (contact has been added)
        assertEquals(1, contactService.getAllContacts().size());
    }

    // Test adding a duplicate contact and ensure it throws an exception
    @Test
    void testAddDuplicateContact() {
        // Create a new contact
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        // Add the contact to the service
        contactService.addContact(contact);
        // Try adding the same contact again and check for IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> contactService.addContact(contact));
    }

    // Test the deleteContact method to ensure a contact is deleted by contact ID
    @Test
    void testDeleteContact() {
        // Create and add a new contact
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        // Delete the contact by its ID
        contactService.deleteContact("123");
        // Verify that no contacts are left in the service (contact has been removed)
        assertEquals(0, contactService.getAllContacts().size());
    }

    // Test the updateContactFields method to ensure contact fields can be updated
    @Test
    void testUpdateContactFields() {
        // Create and add a new contact
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        // Update the contact's fields
        contactService.updateContactFirstName("123", "Mike");  // Update first name
        contactService.updateContactLastName("123", "Smith");   // Update last name
        contactService.updateContactPhone("123", "0987654321"); // Update phone number
        contactService.updateContactAddress("123", "456 Elm St"); // Update address

        // Retrieve the updated contact from the service
        Contact updatedContact = contactService.getAllContacts().get("123");

        // Verify that the contact's fields have been updated correctly
        assertEquals("Mike", updatedContact.getFirstName());
        assertEquals("Smith", updatedContact.getLastName());
        assertEquals("0987654321", updatedContact.getPhone());
        assertEquals("456 Elm St", updatedContact.getAddress());
    }
}
