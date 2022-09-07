package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriendTest {

    @Test
    void testToString_whenCalled_returnsObjectAsString() {

        // GIVEN
        Friend friend = new Friend();
        friend.setName("Karl-Friedrich");
        friend.setPhoneNumber("555-123456");
        friend.setNickname("Kalle");

        // WHEN
        String actual = friend.toString();

        // THEN
        String expected = "Friend{nickname='Kalle', name='Karl-Friedrich', phoneNumber='555-123456'}";
        assertEquals(expected, actual);
    }
}