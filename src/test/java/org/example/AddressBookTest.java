package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void givenContact_whenDeleted_shouldReduceSize() {

        AddressBook book = new AddressBook();

        Contact c = new Contact("Nandha", "Kumar", "Chennai");

        book.addContact(c);
        // add contact first

        book.deleteContact("Nandha");
        // testing delete method

        assertEquals(0, book.getContacts().size());
        // verify list is empty after deletion
    }
}