package Aufgabe_3;

public class UmsatzSteuerRechner {
    private static float berechneUmsatzsteuer (float Brutto_Wert, int Umsatzsteuersatz){
        if (Umsatzsteuersatz <= 0 || Brutto_Wert <= 0){
            System.err.println("Die Werte sollen größer als 0 sein!");
            System.out.println("Geben Sie, bitte, ihre Zahlen erneut an!");
        }
        return (float) (Math.round(100 * (Brutto_Wert - ((Brutto_Wert * 100) / (100 + (Umsatzsteuersatz)))))) / 100;
    }

    public static void main(String[] args) {
        System.out.println(berechneUmsatzsteuer(140,19));

    }
}
