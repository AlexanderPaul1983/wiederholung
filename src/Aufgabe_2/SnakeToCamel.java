package Aufgabe_2;

import java.util.Arrays;

public class SnakeToCamel {
    public String changeFromSnakeToCamel(String snakeString){
        String[] dividedWords = snakeString.split("_");
        // wenn der String nur aus einem Word besteht, wird er ausgegeben
        if(dividedWords.length == 1){
            return Arrays.toString(dividedWords);
        }
        // In einem anderen Fall müssen alle Wörter im Array großgeschrieben werden und dann zusammen gefügt.
        for (int i = 1; i < dividedWords.length ; i++) {
            dividedWords[i] = dividedWords[i].substring(0, 1).toUpperCase() + dividedWords[i].substring(1);


        }
        return String.join("", dividedWords);

    }

    public static void main(String[] args) {
        SnakeToCamel s = new SnakeToCamel();
        System.out.println(s.changeFromSnakeToCamel("hallo_welt_to_snake"));
    }
}
