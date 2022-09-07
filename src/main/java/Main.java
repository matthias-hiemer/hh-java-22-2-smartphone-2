import model.Contact;
import model.Friend;
import model.Smartphone;

public class Main {

    public static void main(String[] args) {

        Friend friend1 = new Friend();
        friend1.setName("Karl-Friedrich");
        friend1.setPhoneNumber("555-123456");
        friend1.setNickname("Kalle");

        Friend friend2 = new Friend();
        friend2.setName("Manfred");
        friend2.setPhoneNumber("555-987654");
        friend2.setNickname("Manni");

        Contact[] contacts = {friend1, friend2};

        Smartphone smartphone = new Smartphone();
        smartphone.setContacts(contacts);
        smartphone.setModel("Galaxy 3000");
        smartphone.setManufacturer("Samsung");

        System.out.println(smartphone);

    }
}
