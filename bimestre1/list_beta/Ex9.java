package list_beta;

import java.util.Scanner;

public class Ex9 {

    public static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] MatrizA = new int[10][10];

        MatrizA = preenxerMatrix(MatrizA);

        MatrizA = trocarl2l8(MatrizA);
        MatrizA = trocarc4c8(MatrizA);
        MatrizA = trocardpds(MatrizA);
        MatrizA = trocarl5c10(MatrizA);

        imprimirMat(MatrizA);
    }

    public static int[][] trocarl5c10(int[][] MatrizA) {
        for (int j = 0; j < MatrizA[0].length; j++) {
            int tmp = MatrizA[5][j];
            MatrizA[5][j] = MatrizA[j][10];
            MatrizA[j][10] = tmp;
        }
        return MatrizA;
    }

    public static int[][] trocardpds(int[][] MatrizA) {

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA.length; j++) {
                if (i + j == MatrizA.length - 1) {
                    int tmp = MatrizA[i][j];
                    MatrizA[i][j] = MatrizA[j][i];
                    MatrizA[j][i] = tmp;
                }
            }
        }

        return MatrizA;
    }

    public static int[][] trocarc4c8(int[][] MatrizA) {
        for (int j = 0; j < MatrizA[0].length; j++) {
            int tmp = MatrizA[j][4];
            MatrizA[j][4] = MatrizA[j][8];
            MatrizA[j][8] = tmp;
        }
        return MatrizA;
    }

    public static int[][] trocarl2l8(int[][] MatrizA) {
        for (int j = 0; j < MatrizA.length; j++) {
            int tmp = MatrizA[2][j];
            MatrizA[2][j] = MatrizA[8][j];
            MatrizA[8][j] = tmp;
        }
        return MatrizA;
    }

    public static void imprimirMat(int[][] MatrizA) {
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                System.out.print(" " + MatrizA[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] preenxerMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = S.nextInt();
            }
        }
        return matrix;

    }
}
