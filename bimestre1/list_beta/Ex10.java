package list_beta;

import java.util.Scanner;

public class Ex10 {

    public static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] A = new int[9][9];
        A = preenxerMatrix(A);

        int soma = calcSumLpares(A);
        System.out.println(soma);
    }

    public static int calcSumLpares(int[][] A) {
        int soma = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i % 2 == 0) { 
                    soma += A[i][j];
                }
            }
        }
        return soma;
    }

    public static int[][] preenxerMatrix(int[][] matrix) {
        for ( int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]= S.nextInt();
            }
        }
        return matrix;
        
     }

   
}
