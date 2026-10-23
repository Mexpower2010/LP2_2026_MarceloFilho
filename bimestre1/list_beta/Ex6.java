package list_beta;

import java.util.Scanner;
public class Ex6 {

    public static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrizA = preenxerMatrix(6, 6);
        int maiorA = encontrarMaior(matrizA);
        float[][] matB = dividirMatrizA(matrizA, maiorA);
        imprimirMat(matB);
    }

    public static void imprimirMat(float[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("%.2f ", mat[i][j]);
            }
            System.out.println();
        }
    }

    public static float[][] dividirMatrizA(int[][] matrizA, int maiorA) {
        float[][] matB = new float[matrizA.length][matrizA.length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matB[i][j] = (float) matrizA[i][j] / maiorA;
            }
        }   
        return matB;
    }

    public static int encontrarMaior(int[][] mat) {
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    if (mat[i][j] > maior) {
                        maior = mat[i][j];
                    }
                }
            }
        }
        return maior;
    }

    public static int[][] preenxerMatrix(int a, int b) {
        int[][] matrix = new int[a][b];
        for ( int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]= S.nextInt();
            }
        }
        return matrix;
        
     }
    
}
