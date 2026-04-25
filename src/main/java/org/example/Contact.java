package org.example;

import java.util.Objects;

public class Contact {

    private String firstName;
    private String lastName;
    private String city;

    public Contact(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        // equals → used by contains() to check duplicate

        if (this == o) return true;

        if (!(o instanceof Contact)) return false;

        Contact c = (Contact) o;

        return firstName.equals(c.firstName);
        // duplicate logic → same name means same person
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
        // hashCode → required when overriding equals
    }
}