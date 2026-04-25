package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class AddressBookServiceTest {

    @Test
    void givenContacts_whenSortedByCity_shouldReturnSortedList() {

        AddressBookService service = new AddressBookService();

        service.addAddressBook("Home");

        service.getAddressBook("Home")
                .addContact(new Contact("Zara", "Khan", "Chennai", "TN", "600001"));

        service.getAddressBook("Home")
                .addContact(new Contact("Arun", "Raj", "Madurai", "TN", "625001"));

        List<Contact> result = service.sortByCity();
        // testing city sorting

        assertEquals("Chennai", result.get(0).getCity());
        assertEquals("Madurai", result.get(1).getCity());
    }

    @Test
    void givenContacts_whenSortedByState_shouldReturnSortedList() {

        AddressBookService service = new AddressBookService();

        service.addAddressBook("Home");

        service.getAddressBook("Home")
                .addContact(new Contact("A", "B", "C", "KA", "1"));

        service.getAddressBook("Home")
                .addContact(new Contact("X", "Y", "Z", "TN", "2"));

        List<Contact> result = service.sortByState();
        // testing state sorting

        assertEquals("KA", result.get(0).getState());
        assertEquals("TN", result.get(1).getState());
    }

    @Test
    void givenContacts_whenSortedByZip_shouldReturnSortedList() {

        AddressBookService service = new AddressBookService();

        service.addAddressBook("Home");

        service.getAddressBook("Home")
                .addContact(new Contact("A", "B", "C", "TN", "600001"));

        service.getAddressBook("Home")
                .addContact(new Contact("X", "Y", "Z", "TN", "500001"));

        List<Contact> result = service.sortByZip();
        // testing zip sorting

        assertEquals("500001", result.get(0).getZip());
        assertEquals("600001", result.get(1).getZip());
    }
}