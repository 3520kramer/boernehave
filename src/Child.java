public class Child {

    private String FirstName;
    private String LastName;
    private String BrithDate;
    private String StreetName;
    private String StreetNumber;
    private int PostalCode = 0000;
    private String City;
    private int contactPerson1;
    private int getContactPerson2;


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setBrithDate(String brithDate) {
        BrithDate = brithDate;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public void setStreetNumber(String streetNumber) {
        StreetNumber = streetNumber;
    }

    public void setPostalCode(int postalCode) {
        PostalCode = postalCode;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setContactPerson1(int contactPerson1) {
        this.contactPerson1 = contactPerson1;
    }

    public void setGetContactPerson2(int getContactPerson2) {
        this.getContactPerson2 = getContactPerson2;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getBrithDate() {
        return BrithDate;
    }

    public String getStreetName() {
        return StreetName;
    }

    public String getStreetNumber() {
        return StreetNumber;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public String getCity() {
        return City;
    }

    public int getContactPerson1() {
        return contactPerson1;
    }

    public int getGetContactPerson2() {
        return getContactPerson2;
    }

}
