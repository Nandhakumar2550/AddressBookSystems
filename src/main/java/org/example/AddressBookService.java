package org.example;

import java.util.HashMap;
import java.util.Map;

public class AddressBookService {

    private Map<String, AddressBook> books = new HashMap<>();
    // Map → store multiple address books

    public void addAddressBook(String name) {
        books.put(name, new AddressBook());
        // put() → add new AddressBook
    }

    public AddressBook getAddressBook(String name) {
        return books.get(name);
        // get() → retrieve AddressBook
    }

    public int getCount() {
        return books.size();
        // getter → safe way to access size (encapsulation)
    }
}