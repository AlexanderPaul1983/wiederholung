package Aufgabe_2;

public class Multiplikation {
    public int multiRecursive(int a, int b){
        int sum;
        if(b == 0 || a == 0){
            return 0;

        } else if (a == 1) {
            return b;

        } else if (b == 1) {
            return a;

        } else if (b < 0) {
            sum = a + multiRecursive(a,b+1);
            return sum;

        } else {
            sum = a + multiRecursive(a,b-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Multiplikation multi = new Multiplikation();
        System.out.println(multi.multiRecursive(3,-5));
    }
}
