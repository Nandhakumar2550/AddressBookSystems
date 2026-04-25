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
                .flatMap(book -> book.getContacts().stream())
                .filter(c -> c.getCity().equals(city))
                // filter → search by city (UC8)

                .toList();
    }

    public Map<String, List<Contact>> groupByCity() {

        return books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getCity));
        // grouping → UC9
    }

    public long countByCity(String city) {

        return books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(c -> c.getCity().equals(city))
                .count();
        // count → UC10
    }

    public List<Contact> sortByName() {

        return books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getFirstName))
                // sort by name → UC11

                .toList();
    }

    public List<Contact> sortByCity() {

        return books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getCity))
                // sort by city → UC12

                .toList();
    }

    public List<Contact> sortByState() {

        return books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getState))
                // sort by state

                .toList();
    }

    public List<Contact> sortByZip() {

        return books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getZip))
                // sort by zip

                .toList();
    }
}