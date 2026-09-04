package     list_beta;

import java.util.Scanner;

public class Ex13 {

    public static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] m = new int[10][10];

        m = preenxerMatrix(m);

        int soma = calcularSomaElementos(m);

        System.out.println(soma);
    }

    public static int calcularSomaElementos(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i<j) {
                    soma += m[i][j];
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
