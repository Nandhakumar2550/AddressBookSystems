package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();
    // List → store multiple contacts dynamically (Collection concept)

    public void addContact(Contact contact) {
        contacts.add(contact);
        // add object into list → core logic of UC2
    }

    public List<Contact> getContacts() {
        return contacts;
        // getter → needed for testing & access
    }
}