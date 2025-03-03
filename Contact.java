package contactservice;

public class Contact {

    // Contact ID must be unique, cannot be null and must be 10 characters or less.
    private final String contactId;
    // First name field cannot be null and must be 10 characters or less.
    private String firstName;
    // Last name field cannot be null and must be 10 characters or less.
    private String lastName;
    // Phone number must be exactly 10 digits.
    private String phone;
    // Address must be valid, not null, and up to 30 characters.
    private String address;

    // Constructor to initialize a new Contact object with validation
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        // Validate the Contact ID (cannot be null and must be 10 characters or less)
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Contact ID can't be null and must be 10 characters or less.");
        }
        this.contactId = contactId;

        // Validate the First Name (cannot be null and must be 10 characters or less)
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name can't be null and must be 10 characters or less.");
        }
        this.firstName = firstName;

        // Validate the Last Name (cannot be null and must be 10 characters or less)
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name can't be null and must be 10 characters or less.");
        }
        this.lastName = lastName;

        // Validate the Phone Number (must be exactly 10 digits and numeric)
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits.");
        }
        this.phone = phone;

        // Validate the Address (cannot be null and must be 30 characters or less)
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address can't be null and must be 30 characters or less.");
        }
        this.address = address;
    }

    // Getter method for the contact ID 
    public String getContactId() {
        return contactId;
    }

    // Getter for the first name
    public String getFirstName() {
        return firstName;
    }

    // Setter for the first name with validation
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name can't be null and must be 10 characters or less.");
        }
        this.firstName = firstName;
    }

    // Getter for the last name
    public String getLastName() {
        return lastName;
    }

    // Setter for the last name with validation
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name can't be null and must be 10 characters or less.");
        }
        this.lastName = lastName;
    }

    // Getter for the phone number
    public String getPhone() {
        return phone;
    }

    // Setter for the phone number with validation
    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits.");
        }
        this.phone = phone;
    }

    // Getter for the address
    public String getAddress() {
        return address;
    }

    // Setter for the address with validation
    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address can't be null and must be 30 characters or less.");
        }
        this.address = address;
    }
}
