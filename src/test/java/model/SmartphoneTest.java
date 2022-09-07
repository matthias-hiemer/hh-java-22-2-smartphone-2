package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {


    @Test
    void startRadio_returnsTrue(){
        // GIVEN
        Smartphone smartphone = new Smartphone();

        // WHEN
        boolean actual = smartphone.startRadio();

        // THEN
        assertEquals(true, actual);
    }

    @Test
    void stopRadio_returnsFalse(){
        // GIVEN
        Smartphone smartphone = new Smartphone();

        // WHEN
        boolean actual = smartphone.stopRadio();

        // THEN
        assertEquals(false, actual);
    }

    @Test
    void getPosition_returnsString(){
        // GIVEN
        Smartphone smartphone = new Smartphone();

        // WHEN
        String actual = smartphone.getPosition();

        // THEN
        assertEquals("Köln", actual);
    }

    @Test
    void toString_returnsObjectAsString(){
        // GIVEN
        Smartphone smartphone = generateDummySmartphone();

        // WHEN
        String actual = smartphone.toString();

        // THEN
        String expected = "Smartphone{model='Galaxy 3000', manufacturer='Samsung', contacts=[Friend{nickname='Kalle', name='Karl-Friedrich', phoneNumber='555-123456'}, Friend{nickname='Manni', name='Manfred', phoneNumber='555-987654'}]}";
        assertEquals(expected, actual);
    }


    private Smartphone generateDummySmartphone() {
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
        return smartphone;
    }

}