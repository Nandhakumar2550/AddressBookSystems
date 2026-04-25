package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookService {

    private Map<String, AddressBook> books = new HashMap<>();
    // Map → store multiple address books

    public void addAddressBook(String name) {
        books.put(name, new AddressBook());
    }

    public AddressBook getAddressBook(String name) {
        return books.get(name);
    }

    public int getCount() {
        return books.size();
    }

    public List<Contact> searchByCity(String city) {

        return books.values().stream()
                // stream() → process all address books

                .flatMap(book -> book.getContacts().stream())
                // flatMap → combine all contact lists into one stream

                .filter(c -> c.getCity().equals(city))
                // filter → select matching city

                .collect(Collectors.toList());
        // collect → convert stream to List
    }
}