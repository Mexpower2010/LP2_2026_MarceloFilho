package list_beta;

import java.util.Scanner;

public class Ex11 {

    public static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] A = new int[6][6];
        int[] Dprincipla = new int[6];
        int[][] B = new int[6][6];
        A = preenxerMatrix(A);

        Dprincipla = separarDP(A);

        B = fazerMatriz(A, Dprincipla);
        
        imprimirMat(B);
    }

    public static void imprimirMat(int[][] A) {
       
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(" " + A[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] fazerMatriz(int[][]A, int[] Dprincipla) {
        int[][] B = new int[6][6];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                B[i][j] = A[i][j] * Dprincipla[i];
            }
        }
        return B;
    }

    public static int[] separarDP(int[][]A) {
        int[] vet = new int[6];
        int posicao =0;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (i==j) {
                    vet[posicao] = A[i][j];
                    posicao++;
                }
            }
        }
        return vet;
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
