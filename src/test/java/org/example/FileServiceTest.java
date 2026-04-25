package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.io.IOException;

class FileServiceTest {

    @Test
    void givenContacts_whenWrittenAndRead_shouldMatch() throws IOException {

        AddressBook book = new AddressBook();

        Contact c1 = new Contact("Nandha", "Kumar", "Chennai", "TN", "600001");
        Contact c2 = new Contact("Arun", "Raj", "Madurai", "TN", "625001");

        book.addContact(c1);
        book.addContact(c2);

        FileService fileService = new FileService();

        String fileName = "contacts.txt";

        fileService.writeToFile(book.getContacts(), fileName);
        // write data to file

        List<String> data = fileService.readFromFile(fileName);
        // read file

        assertEquals(2, data.size());
        // verify number of lines
    }
}