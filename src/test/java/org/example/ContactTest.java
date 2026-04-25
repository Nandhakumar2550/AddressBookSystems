package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void givenContact_whenCreated_shouldHaveCorrectValues() {

        Contact c = new Contact("Nandha", "Kumar", "Chennai");
        // testing constructor

        assertEquals("Nandha", c.getFirstName());
        // verify expected vs actual

        assertEquals("Kumar", c.getLastName());

        assertEquals("Chennai", c.getCity());
    }
}