package Aufgabe_2;

public class Vogel extends Tier{
    public Vogel(String name, int age) {
        super(name, age);
    }

    @Override
    void lautGeben() {
        System.out.println("zwicht-zwitch");
    }
}
