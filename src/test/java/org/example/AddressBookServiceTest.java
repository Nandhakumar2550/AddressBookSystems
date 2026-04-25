package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class AddressBookServiceTest {

    @Test
    void givenContactsInMultipleBooks_whenSearchedByCity_shouldReturnResults() {

        AddressBookService service = new AddressBookService();

        service.addAddressBook("Home");
        service.addAddressBook("Office");

        service.getAddressBook("Home")
                .addContact(new Contact("Nandha", "Kumar", "Chennai"));

        service.getAddressBook("Office")
                .addContact(new Contact("Arun", "Raj", "Chennai"));

        List<Contact> result = service.searchByCity("Chennai");
        // testing search using stream

        assertEquals(2, result.size());
        // verify both contacts found
    }
}