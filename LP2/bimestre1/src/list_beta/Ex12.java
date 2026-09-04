package list_beta;

import java.util.Scanner;

public class Ex12 {

    public static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] m = new int[12][12];
       
        m = preenxerMatrix(m);

        int soma = sum(m);

        int numNuns = (12*11)/2;
        double media = calcularMedia(soma, numNuns);
        System.out.println(media);
    }

    public static double calcularMedia(int soma, int numNuns) {
        double mediaAt = (double) soma / numNuns;
        return mediaAt;
    }

    public static int sum(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i>j) {
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

    public static void imprimir(String text) {
        System.out.println(text);
    }

    
}
