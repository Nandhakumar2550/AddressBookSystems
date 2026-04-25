package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void givenContact_whenAdded_shouldIncreaseSize() {

        AddressBook book = new AddressBook();

        Contact c = new Contact("Nandha", "Kumar", "Chennai");

        book.addContact(c);
        // testing addContact() method

        assertEquals(1, book.getContacts().size());
        // verify contact is added → size should be 1
    }
}