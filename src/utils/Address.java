package utils;

public class Address {

    public String firstName;
    public String lastName;
    public String streetName;
    public String streetNumber;
    public String zipCode;
    public String city;
    public String email;

    public void generateAddress() {
        this.firstName = "FirstName";
        this.lastName = "LastName";
        this.streetName = "Strelitzer";
        this.streetNumber = "54";
        this.zipCode = "10115";
        this.city = "Berlin";
        this.email = "somebody@example.com";
    }

}
