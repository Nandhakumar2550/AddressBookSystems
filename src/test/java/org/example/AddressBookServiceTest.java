package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.List;

class AddressBookServiceTest {

    @Test
    void givenContacts_whenGroupedByCity_shouldReturnMap() {

        AddressBookService service = new AddressBookService();

        service.addAddressBook("Home");

        service.getAddressBook("Home")
                .addContact(new Contact("Nandha", "Kumar", "Chennai"));

        service.getAddressBook("Home")
                .addContact(new Contact("Arun", "Raj", "Madurai"));

        Map<String, List<Contact>> result = service.groupByCity();
        // testing grouping logic

        assertEquals(1, result.get("Chennai").size());
        // verify Chennai group

        assertEquals(1, result.get("Madurai").size());
        // verify Madurai group
    }
}