package list_beta;
import java.util.Scanner;
public class Ex4 {
    public final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matrix = preenxerMatriz(7,6);
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += matrix[5][i];
        }
        System.out.println(sum);
    }
    public static int[][] preenxerMatriz(int a, int b) {
        int matrix[][] = new int[a][b];
        for ( int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]= S.nextInt();
            }
        }
        return matrix;
        
     }
}
