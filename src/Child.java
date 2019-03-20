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


    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setBrithDate(String bDate) {
        this.birthDate = bDate;
    }

    public void setStreetName(String strName) {
        this.streetName = strName;
    }

    public void setStreetNumber(int strNumber) {
        this.streetNumber = strNumber;
    }

    public void setPostalCode(int postCode) {
        this.postalCode = postCode;
    }

    public void setCity(String city1) {
        this.city = city1;
    }

    public void setContactPerson1(int cPerson1) {
        this.contactPerson1 = cPerson1;
    }

    public void setGetContactPerson2(int cPerson2) {
        this.contactPerson2 = cPerson2;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBrithDate() {
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

    public void registerNewChild() throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        Child child = new Child();
        PrintStream writeChildToFile = new PrintStream(new FileOutputStream("Children.txt", true));

        System.out.println("Indtast fornavn: ");
        String fName = input.nextLine();

        System.out.println("Indtast efternavn:");
        String lname = input.nextLine();

        System.out.println("Indtast fødselsdagsdato: ");
        String bdate = input.nextLine();

        System.out.println("Indtast vejnavn: ");
        String strName = input.nextLine();

        System.out.println("Indtast husnummer: ");
        int strNumber = input.nextInt();

        System.out.println("Indtast postnummer: ");
        int postCode = input.nextInt();

        System.out.println("Indtast by: ");
        String city1 = input.nextLine();



    }
}
