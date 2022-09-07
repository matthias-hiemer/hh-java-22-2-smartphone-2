package model;

public class Friend extends Contact {

    private String nickname;

    public Friend() {
        super();
    }

    public Friend(String name, String phoneNumber, String nickname) {
        super(name, phoneNumber);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
