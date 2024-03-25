package Aufgabe_2;

public class Katze extends Tier{

    public Katze(String name, int age) {
        super(name, age);
    }

    @Override
    void lautGeben() {
        System.out.println("mau-mau");
    }
}
