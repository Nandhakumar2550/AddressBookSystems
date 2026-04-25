package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void givenMultipleContacts_whenAdded_shouldReturnCorrectCount() {

        AddressBook book = new AddressBook();

        Contact c1 = new Contact("Nandha", "Kumar", "Chennai", "TN", "600001");
        Contact c2 = new Contact("Arun", "Raj", "Madurai", "TN", "625001");

        book.addContact(c1);
        book.addContact(c2);
        // adding multiple contacts → UC5

        assertEquals(2, book.getContacts().size());
        // verify size
    }
}