package Aufgabe_3;

public class Passwortgenerator {
    public static void toMakePassword (int length){

        for (int i = 0; i < length; i++) {
            char zeichen = (char) Math.round(Math.random() * 93 + 33);
            System.out.print(zeichen + " ");

        }
    }

    public static void main(String[] args) {
        toMakePassword(10);
    }
}
