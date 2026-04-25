package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class AddressBookServiceTest {

    @Test
    void givenContacts_whenSortedByName_shouldReturnSortedList() {

        AddressBookService service = new AddressBookService();
        // create service object

        service.addAddressBook("Home");
        // add address book

        service.getAddressBook("Home")
                .addContact(new Contact("Zara", "Khan", "Chennai"));

        service.getAddressBook("Home")
                .addContact(new Contact("Arun", "Raj", "Madurai"));
        // add multiple contacts

        List<Contact> result = service.sortByName();
        // call sorting method (UC11)

        assertEquals("Arun", result.get(0).getFirstName());
        // verify first element (alphabetically smallest)

        assertEquals("Zara", result.get(1).getFirstName());
        // verify second element
    }
}