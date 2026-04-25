package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();
    // List → store multiple contacts (collection concept)

    public void addContact(Contact contact) {
        contacts.add(contact);
        // UC2 → add contact into list
    }

    public List<Contact> getContacts() {
        return contacts;
        // getter → used for testing & access
    }

    public void editContact(String name, String newCity) {

        for (Contact c : contacts) {
            // loop → iterate to find contact

            if (c.getFirstName().equals(name)) {
                // equals → match contact by name

                c.setCity(newCity);
                // setter → update value (UC3)
            }
        }
    }

    public void deleteContact(String name) {

        contacts.removeIf(c -> c.getFirstName().equals(name));
        // removeIf → delete matching contact directly (UC4, Java 8 feature)
    }
    public void addUniqueContact(Contact contact) {

        if (!contacts.contains(contact)) {
            // contains() → checks duplicate using equals()

            contacts.add(contact);
            // add only if not duplicate
        }
    }
}