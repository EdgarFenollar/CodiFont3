public class Person {
    private String Name;
    private  int PhoneNumber;
    private String EmailAddress;
    private Address lives_at;
    private AddressBook code;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public Address getLives_at() {
        return lives_at;
    }

    public void setLives_at(Address lives_at) {
        this.lives_at = lives_at;
    }

    public AddressBook getCode() {
        return code;
    }

    public void setCode(AddressBook code) {
        this.code = code;
    }

    public Person(String name, int phoneNumber, String emailAddress) {
        this.Name = name;
        this.PhoneNumber = phoneNumber;
        this.EmailAddress = emailAddress;
    }

    public Person(String name, int phoneNumber, String emailAddress, Address lives_at) {
        this.Name = name;
        this.PhoneNumber = phoneNumber;
        this.EmailAddress = emailAddress;
        this.lives_at = lives_at;
    }

    public Person(String name, int phoneNumber, String emailAddress, Address lives_at, AddressBook code) {
        this.Name = name;
        this.PhoneNumber = phoneNumber;
        this.EmailAddress = emailAddress;
        this.lives_at = lives_at;
        this.code = code;
    }

    public static void PurchaseParkingPass(){

    }
}
