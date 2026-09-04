package list_goat_oda_mastes;

import java.util.Scanner;

class Ex1 {

    public final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] m = new int[S.nextInt()][S.nextInt()];
        m = preenxerMatrix(m);
        imprimirMatrix(m);
    }
    public static void imprimirMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] preenxerMatrix(int[][] matrix) {
        for ( int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]= (2*i) + (j*j);
            }
        }
        return matrix;
    }
    
}