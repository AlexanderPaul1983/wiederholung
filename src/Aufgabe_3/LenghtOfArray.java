package Aufgabe_3;


import java.util.Arrays;

public class LenghtOfArray {
    public static int[] manipulateArraylenght(int[] inputString, int toCut) {
        if ((toCut * -1) > inputString.length) {
            System.err.println("The operation is not possible. The length of Array is shorter than your input");
            System.out.println("Please, try again, and give in field toCut a integer, " +
                    "that is shorter or same than " + inputString.length);
            return null;
        }
        int[] shortString = new int[inputString.length + toCut];

        int[] helpString = new int[inputString.length + toCut];

        if ((toCut * -1) < inputString.length || toCut == 0) {
            if (toCut == 0) {
                return inputString;
            } else if (toCut < 0) {
                if (inputString.length + toCut >= 0)
                    System.arraycopy(inputString, 0, shortString, 0, inputString.length + toCut);
                return shortString;
            } else {

                int[] subInterArray = new int[toCut];
                Arrays.fill(subInterArray, -1);

                System.arraycopy(inputString, 0, helpString, 0, inputString.length);
                System.arraycopy(subInterArray, 0, helpString, inputString.length, subInterArray.length);


            }
        }
        return helpString;

    }


    public static void main(String[] args) {
        int[] probe = {1,2,3,5};
        System.out.println(Arrays.toString(manipulateArraylenght(probe, -2)));
    }


    }
