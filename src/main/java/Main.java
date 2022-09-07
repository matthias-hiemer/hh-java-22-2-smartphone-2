import model.Friend;

public class Main {

    public static void main(String[] args) {

        Friend friend = new Friend();
        friend.setName("Karl-Friedrich");
        friend.setPhoneNumber("555-123456");
        friend.setNickname("Kalle");

        System.out.println(friend);
    }
}
