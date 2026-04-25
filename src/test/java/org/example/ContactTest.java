package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void givenContact_whenCreated_shouldHaveCorrectValues() {

        Contact c = new Contact("Nandha", "Kumar", "Chennai", "TN", "600001");
        // pass all required parameters

        assertEquals("Nandha", c.getFirstName());
        assertEquals("Kumar", c.getLastName());
        assertEquals("Chennai", c.getCity());
    }
}