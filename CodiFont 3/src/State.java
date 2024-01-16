public class State {
    private int id;
    private String name;
    private Country c;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getC() {
        return c;
    }

    public void setC(Country c) {
        this.c = c;
    }

    public State(int id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.c = country;
    }
}
