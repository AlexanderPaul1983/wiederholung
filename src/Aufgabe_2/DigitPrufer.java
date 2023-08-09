package Aufgabe_2;

public class DigitPrufer {
    int digit = 0;
    int letter = 0;
    public void toFindDigits (String word){
        for (char c: word.toCharArray()) {
            if (Character.isDigit(c)) {
                digit++;
            } else letter++;
        }

            if(letter == 0){
                System.out.println("das ist eine "+ digit+"-stellige Zahl");
            } else if (letter>0) {
                System.out.println("keine Zahl");

            }


    }

    public static void main(String[] args) {
        String wort = "1a234";
        DigitPrufer DigitChecker = new DigitPrufer();
        DigitChecker.toFindDigits(wort);

    }
}
