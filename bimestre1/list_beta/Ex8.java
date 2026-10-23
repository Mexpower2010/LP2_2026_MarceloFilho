package list_beta;

import java.util.Scanner;


public class Ex8 {

    public static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matM = preenxerMatrix(6, 6);
        int A = S.nextInt();
        int[] vetV = matrixVezesA(matM, A);
        imprimirVetor(vetV);
    }
    public static void imprimirVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }
    public static int[] matrixVezesA(int[][] M, int A) {
        int[] vet = new int[36];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = M[(int)i/6][i%6] * A;
        }
        return vet;
        
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