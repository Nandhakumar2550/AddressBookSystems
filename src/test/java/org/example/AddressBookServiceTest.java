package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookServiceTest {

    @Test
    void givenContacts_whenCountedByCity_shouldReturnCorrectCount() {

        AddressBookService service = new AddressBookService();

        service.addAddressBook("Home");

        service.getAddressBook("Home")
                .addContact(new Contact("Nandha", "Kumar", "Chennai"));

        service.getAddressBook("Home")
                .addContact(new Contact("Arun", "Raj", "Chennai"));

        long count = service.countByCity("Chennai");
        // testing count method

        assertEquals(2, count);
        // verify result
    }
}