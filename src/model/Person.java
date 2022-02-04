package model;

public class Person {
    private String navn;
    private int number;
    private int numbert2;

    public Person(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
