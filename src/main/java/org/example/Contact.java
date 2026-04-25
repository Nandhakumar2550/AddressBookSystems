package org.example;

import java.util.Objects;

public class Contact {

    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zip;

    public Contact(String firstName, String lastName, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
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

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact c = (Contact) o;
        return firstName.equals(c.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }
}