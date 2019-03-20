import java.io.*;
import java.util.*;
import java.lang.*;

public class Child {

    private String firstName;
    private String lastName;
    private String birthDate;
    private String streetName;
    private int streetNumber;
    private int postalCode = 0;
    private String city;
    private int contactPerson1;
    private int contactPerson2;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setContactPerson1(int contactPerson1) {
        this.contactPerson1 = contactPerson1;
    }

    public void setContactPerson2(int contactPerson2) {
        this.contactPerson2 = contactPerson2;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public int getContactPerson1() {
        return contactPerson1;
    }

    public int getContactPerson2() {
        return contactPerson2;
    }
}
