package model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Hugo");
    }

    @Test
    void getNavn() {
        assertEquals("Hugo", person.getNavn());
    }

    @Test
    void setNavn() {
        person.setNavn("Abe");
        assertEquals("Abe", person.getNavn());

    }

    @Test
    void getNumber() {
        assertEquals("Hugo", person.getNavn());
    }
}