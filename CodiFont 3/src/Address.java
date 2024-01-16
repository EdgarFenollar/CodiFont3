
public class Address {
    private String Street;
    private String City;
    private int PostalCode;
    private State s;


    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        this.Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int postalCode) {
        this.PostalCode = postalCode;
    }

    public State getS() {
        return s;
    }

    public void setS(State s) {
        this.s = s;
    }

    public Address(String street, String city, int postalCode, State s) {
        this.Street = street;
        this.City = city;
        this.PostalCode = postalCode;
        this.s = s;
    }
}
