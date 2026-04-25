package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void givenContact_whenEdited_shouldUpdateCity() {

        AddressBook book = new AddressBook();

        Contact c = new Contact("Nandha", "Kumar", "Chennai");
        book.addContact(c);

        book.editContact("Nandha", "Madurai");
        // testing edit method

        assertEquals("Madurai", book.getContacts().get(0).getCity());
        // verify city updated
    }
}