import java.lang.reflect.Array;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String word = " ";

        char[] charArray = word.toCharArray();
        StringBuilder compareWord1 = new StringBuilder();
        StringBuilder compareWord2 = new StringBuilder();


        for (int i = 0; i < charArray.length / 2; i++) {
            compareWord1.append(charArray[i]);
            compareWord2.append(charArray[charArray.length - 1 - i]);


        }
        if(compareWord2.isEmpty() && compareWord1.isEmpty()){
            System.out.println("Das word hat keine Zeichen");
        }
        else if(compareWord2.toString().contentEquals(compareWord1)){
            System.out.println("Das word ist ein Polygon");
        }
        else System.out.println("Das Word ist kein Polygon");
    }
}