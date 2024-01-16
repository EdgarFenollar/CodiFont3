public class Main {
    public static void main(String[] args) {
        //Paises:
        Country Spain = new Country(1, "España");
        Country France = new Country(2, "Francia");

        //Ciudades:
        State comunitat_valencia = new State(1, "Comunitat Valencia", Spain);
        State navarra = new State(2, "Navarra", Spain);
        State champagne = new State(3, "Champagne", France);

        //Direcciones:
        Address relleu = new Address("Carrer Major", "Relleu", 3578, comunitat_valencia);
        Address pamplona = new Address("Calle Estafeta", "Pamplona", 31001, navarra);
        Address reims = new Address("Plaza Drouet d'Erlon", "Reims", 32423, champagne);

        //Personas:
        Person edgar1 = new Person("Edgar", 267821968, "edgarfenollarcanto@gmail.com", relleu);
        Person miguel1 = new Person("Miguel", 286738693, "miguelbayona@gmail.com", pamplona);
        Person isaac1 = new Person("Isaac", 123456789, "isaacjose@gmail.com", reims);

        //Libro Direcciones:
        AddressBook ad1 = new AddressBook(1);
    }
}
