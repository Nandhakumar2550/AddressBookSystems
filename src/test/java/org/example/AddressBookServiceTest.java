package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookServiceTest {

    @Test
    void givenMultipleAddressBooks_whenAdded_shouldReturnCorrectCount() {

        AddressBookService service = new AddressBookService();
        // create service object

        service.addAddressBook("Home");
        service.addAddressBook("Office");
        // add multiple address books

        assertEquals(2, service.getCount());
        // verify using getter
    }
}