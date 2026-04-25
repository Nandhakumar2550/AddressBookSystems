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
                // combine all contacts

                .filter(c -> c.getCity().equals(city))
                // filter → search

                .toList();
    }

    public Map<String, List<Contact>> groupByCity() {

        return books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getCity));
        // groupingBy → group contacts by city (UC9)
    }

    public long countByCity(String city) {

        return books.values().stream()
                // stream → process all books

                .flatMap(book -> book.getContacts().stream())
                // combine all contacts

                .filter(c -> c.getCity().equals(city))
                // filter → match city

                .count();
        // count → total number of contacts (UC10)
    }

    public List<Contact> sortByName() {

        return books.values().stream()
                // stream → process all books

                .flatMap(book -> book.getContacts().stream())
                // combine all contacts

                .sorted(Comparator.comparing(Contact::getFirstName))
                // sorted → sort contacts by first name (UC11)

                .toList();
        // convert stream → list
    }
}