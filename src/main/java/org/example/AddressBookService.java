package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookService {

    private Map<String, AddressBook> books = new HashMap<>();
    // Map → multiple address books (UC6)

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
                // stream → process all books

                .flatMap(book -> book.getContacts().stream())
                // flatMap → combine all contacts

                .filter(c -> c.getCity().equals(city))
                // filter → search condition

                .toList();
        // convert to list (UC8)
    }

    public Map<String, List<Contact>> groupByCity() {

        return books.values().stream()
                // stream → process all books

                .flatMap(book -> book.getContacts().stream())
                // combine all contacts

                .collect(Collectors.groupingBy(Contact::getCity));
        // groupingBy → group contacts by city (UC9)
    }
}