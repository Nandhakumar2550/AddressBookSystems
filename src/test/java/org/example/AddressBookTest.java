package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void givenMultipleContacts_whenAdded_shouldReturnCorrectCount() {

        AddressBook book = new AddressBook();

        Contact c1 = new Contact("Nandha", "Kumar", "Chennai");
        Contact c2 = new Contact("Arun", "Raj", "Madurai");

        book.addContact(c1);
        book.addContact(c2);
        // calling addContact multiple times → UC5 concept

        assertEquals(2, book.getContacts().size());
        // verify multiple contacts stored
    }
}