package Aufgabe_2;

public class LengthOfString {
    public static String toMeasureSting(String ... strings) {
        if(strings == null || strings.length == 0){
            return "Your String is empty";
        }
        String longestString = " ";

        for (String s : strings) {

            if (s.length() > longestString.length()) {
                longestString = s;
            }
        }
            return "The longest word of the string is - " + longestString;

    }

    public static void main(String[] args) {
        System.out.println(toMeasureSting("Java", "ist", "toll"));
    }
    }



