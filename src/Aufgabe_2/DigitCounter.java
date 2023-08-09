package Aufgabe_2;

// Methode für den int Array

public class DigitCounter {
    public void toCountDigits(int[] digitArray) {
        int zero= 0;
        int one = 0;
        int two = 0;
        int three = 0;

        for (int j : digitArray) {


            switch (j) {
                case 0 -> zero++;
                case 1 -> one++;
                case 2 -> two++;
                case 3 -> three++;
            }

        }
        System.out.println("Folgende Zahlen kommen in diesem Integer Array vor: 0 kommt "+ zero+ " mal vor. "+ "1 kommt "
                + one + " mal vor. " + "2 kommt "+ two + " mal vor. " + "3 kommt "+ three + " mal vor. ");
    }

    // Methode für den String Array

    


    public static void main(String[] args) {
        DigitCounter counter = new DigitCounter();
        int[] a = {0,0,1,2,3,3};
       counter.toCountDigits(a);



    }
}
