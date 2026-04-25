package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();
    // List → store multiple contacts

    public void addContact(Contact contact) {
        contacts.add(contact);
        // UC2 → add contact
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void editContact(String name, String newCity) {

        for (Contact c : contacts) {
            // loop → search contact

            if (c.getFirstName().equals(name)) {
                // match by name

                c.setCity(newCity);
                // update using setter → UC3 main logic
            }
        }
    }
}