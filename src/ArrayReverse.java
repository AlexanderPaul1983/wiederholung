import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] integerArray = {1,2,3,4,5,6,7};

        int[] emptyArray = new int[integerArray.length];

        for (int i = integerArray.length-1; i >= 0 ; i--) {
            emptyArray[integerArray.length-i-1] += integerArray[i];

        }
        System.out.println(Arrays.toString(emptyArray));

    }


}
