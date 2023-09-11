package Aufgabe_2;

public class MatrizenMultiplikation {



        public static void main(String[] args) {
            // Beispielmatrizen
            int[][] matrixA = {
                    {1, 2},
                    {3, 4},
                    {5, 6}
            };

            int[][] matrixB = {
                    {2, 3},
                    {4, 5}
            };

            int[][] result = multiplyMatrices(matrixA, matrixB);

            if (result != null) {
                for (int[] ints : result) {
                    for (int j = 0; j < result[0].length; j++) {
                        System.out.print(ints[j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Die Matrizen können nicht multipliziert werden.");
            }
        }

        public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
            int rowsA = matrixA.length;
            int colsA = matrixA[0].length;
            int rowsB = matrixB.length;
            int colsB = matrixB[0].length;

            // Überprüfen, ob die Matrizen multipliziert werden können
            if (colsA != rowsB) {
                return null;
            }

            int[][] result = new int[rowsA][colsB];

            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            return result;
        }
    }





