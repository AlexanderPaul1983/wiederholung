package Aufgabe_2;

public class Hund extends Tier{

    public Hund(String name, int age) {
        super(name, age);
    }

    @Override
    void lautGeben() {
        System.out.println("wae-waw");
    }
}
