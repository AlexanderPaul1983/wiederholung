package Aufgabe_2;

public class LeghtOfString {
    public static String toMeasureSting(String ... strings) {
        if(strings == null || strings.length==0){
            return "Der String ist leer";
        }
        String longestString = " ";

        for (String s : strings) {

            if (s.length() > longestString.length()) {
                longestString = s;
            }
        }
            return longestString;

    }

    public static void main(String[] args) {
        System.out.println(toMeasureSting("Java", "ist", "toll"));
    }
    }



