package org.example;

public class Contact {

    private String firstName;
    private String lastName;
    private String city;
    // encapsulation → data hiding

    public Contact(String firstName, String lastName, String city) {
        // constructor → initialize object
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public String getFirstName() {
        return firstName; // getter → access private data
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
        // setter → used to update value (UC3)
    }
}