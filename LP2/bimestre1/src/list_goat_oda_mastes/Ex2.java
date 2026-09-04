package list_goat_oda_mastes;

import java.util.Scanner;

public class Ex2 {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {    
        int[][] m = new int[S.nextInt()][S.nextInt()];
        m = preenxerMatrix(m);
        imprimirMatrix(m);
    }
    public static int[][] preenxerMatrix(int[][] matrix) {
        for ( int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if((i+j)%2==0){
                    matrix[i][j]=-(j*j);
                }else{
                    matrix[i][j] = 2*(i+j);
                }
            }
        }
        return matrix;
    }
    public static void imprimirMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    
}
