import java.util.ArrayList;

public class AddressBook {
    private int Code;
    private ArrayList<Person> persons;

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        this.Code = code;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public AddressBook(int code) {
        this.Code = code;
    }

    public AddressBook(int code, ArrayList<Person> persons) {
        this.Code = code;
        this.persons = persons;
    }
}
