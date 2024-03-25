package Aufgabe_2;

public abstract class Tier {
    String name;
    int age;

     abstract void lautGeben();
     public static void lautZeigen(Tier animal){
         animal.lautGeben();
     }
    public Tier(String name, int age){
         this.name = name;
         this.age = age;
    }

    public static void main(String[] args) {
    Hund hund = new Hund("Bello", 2);
    hund.lautGeben();

    }
}
