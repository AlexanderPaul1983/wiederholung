package Aufgabe_2;

// Methode für den int Array

public class DigitCounter {
    public void toCountDigits(int[] digitArray) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int fore = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;

        for (int j : digitArray) {


            switch (j) {
                case 0 -> zero++;
                case 1 -> one++;
                case 2 -> two++;
                case 3 -> three++;
                case 4 -> fore++;
                case 5 -> five++;
                case 6 -> six++;
                case 7 -> seven++;
                case 8 -> eight++;
                case 9 -> nine++;

            }

        }
        // muss noch erweitert werden: Bis zum 9 ausbauen; jeder Satz in einer neuen Zeile anfangen. Außerdem korrigieren zu "Die Zahl Eins kommt 1 Mal vor"
        System.out.println("Folgende Zahlen kommen in diesem Integer Array vor:");
        if ( zero > 0){
            System.out.println("Die Zahl 0 kommt " + zero + " maly vor");
        }
        if ( one > 0){
            System.out.println("Die Zahl 1 kommt " + one + " mal vor");
        }
        if ( two > 0){
            System.out.println("Die Zahl 2 kommt " + two + " mal vor");
        }
        if ( three > 0){
            System.out.println("Die Zahl 3 kommt " + three + " mal vor");
        }
        if ( fore > 0){
            System.out.println("Die Zahl 4 kommt " + fore + " mal vor");
        }
        if ( five > 0){
            System.out.println("Die Zahl 5 kommt " + five + " mal vor");
        }
        if ( six > 0){
            System.out.println("Die Zahl 6 kommt " + six + " mal vor");
        }
        if ( seven > 0){
            System.out.println("Die Zahl 7 kommt " + seven + " mal vor");
        }
        if ( eight > 0){
            System.out.println("Die Zahl 8 kommt " + eight + " mal vor");
        }
        if ( nine > 0){
            System.out.println("Die Zahl 9 kommt " + nine + " mal vor");
        }

    }

    // Methode für den String Array

    


    public static void main(String[] args) {
        DigitCounter counter = new DigitCounter();
        int[] a = {0,0,1,2,3,3,6,6,6,8,9,9,9,9};
       counter.toCountDigits(a);



    }
}
