package list_beta;

import java.util.Scanner;


public class Ex5 {

    public static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mat =preenxerMatrix(6, 6);
        int menor = soucerLitlleValue(mat);
        System.out.println(menor);
    }

public static int soucerLitlleValue(int[][] mat) {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i +j == mat.length - 1) {
                    if (mat[i][j] < menor) {
                        menor = mat[i][j];
                    }
                }
            }
        }
        return menor;
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
