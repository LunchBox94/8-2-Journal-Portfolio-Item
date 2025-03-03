package contactservice;

import java.util.HashMap;
import java.util.Map;

public class ContactService {

    // A Map to store contacts with the contact ID as the key and the Contact object as the value
    private final Map<String, Contact> contacts = new HashMap<>();

    // Adds a new contact to the contact list if the contact ID is unique
    public void addContact(Contact contact) {
        // Check if the contact ID already exists in the contacts map
        if (contacts.containsKey(contact.getContactId())) {
            // If it does, throw an exception indicating that the contact ID already exists
            throw new IllegalArgumentException("Contact ID already exists.");
        }
        // If the contact ID is unique, add the contact to the map
        contacts.put(contact.getContactId(), contact);
    }

    // Deletes a contact by its contact ID
    public void deleteContact(String contactId) {
        // Check if the contact exists in the contacts map
        if (!contacts.containsKey(contactId)) {
            // If not, throw an exception indicating that the contact ID was not found
            throw new IllegalArgumentException("Contact ID not found.");
        }
        // Remove the contact from the map using the contact ID
        contacts.remove(contactId);
    }

    // Updates the first name of a contact by its contact ID
    public void updateContactFirstName(String contactId, String firstName) {
        // Check if the contact exists in the contacts map
        if (!contacts.containsKey(contactId)) {
            // If not, throw an exception indicating that the contact ID was not found
            throw new IllegalArgumentException("Contact ID not found.");
        }
        // Update the first name of the contact
        contacts.get(contactId).setFirstName(firstName);
    }

    // Updates the last name of a contact by its contact ID
    public void updateContactLastName(String contactId, String lastName) {
        // Check if the contact exists in the contacts map
        if (!contacts.containsKey(contactId)) {
            // If not, throw an exception indicating that the contact ID was not found
            throw new IllegalArgumentException("Contact ID not found.");
        }
        // Update the last name of the contact
        contacts.get(contactId).setLastName(lastName);
    }

    // Updates the phone number of a contact by its contact ID
    public void updateContactPhone(String contactId, String phone) {
        // Check if the contact exists in the contacts map
        if (!contacts.containsKey(contactId)) {
            // If not, throw an exception indicating that the contact ID was not found
            throw new IllegalArgumentException("Contact ID not found.");
        }
        // Update the phone number of the contact
        contacts.get(contactId).setPhone(phone);
    }

    // Updates the address of a contact by its contact ID
    public void updateContactAddress(String contactId, String address) {
        // Check if the contact exists in the contacts map
        if (!contacts.containsKey(contactId)) {
            // If not, throw an exception indicating that the contact ID was not found
            throw new IllegalArgumentException("Contact ID not found.");
        }
        // Update the address of the contact
        contacts.get(contactId).setAddress(address);
    }

    // Returns all the contacts in the map for testing or display purposes
    public Map<String, Contact> getAllContacts() {
        return contacts;
    }
}
