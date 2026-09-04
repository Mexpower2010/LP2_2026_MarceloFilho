package list_beta;
import java.util.Scanner;
public class Ex7 {
    public final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int [][] matrizA = preenxerMatrix(6, 4);
        int [][] matrizB = preenxerMatrix(4, 6);
        int [][] matrizC = multiplicaçãoMatricial(matrizA, matrizB);
        imprimirMat(matrizC);
    } 
    public static void imprimirMat(int[][] MatrizA) {
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                System.out.print(" " + MatrizA[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] multiplicaçãoMatricial(int[][] mA, int [][]mB) {
        int [][] mC = new int[mA.length][mB[0].length];
        for (int i = 0; i < mC.length; i++) {
            for (int j = 0; j < mC.length; j++) {
                int sum = 0;
                for (int k = 0; k < mB.length; k++) {
                    sum=+(mA[i][k]*mB[k][j]);
                }
                mC[i][j] = sum;
            }
        }
        return mC;
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
