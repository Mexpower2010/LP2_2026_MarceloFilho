package list_beta;
import java.util.Scanner;
public class Ex3 {
    public final static Scanner S = new Scanner(System.in); 
    public static void main(String[] args) {
        int[][] m = new int[6][6];
        m = preenxerMatrix(m);
        System.out.println(sumDiagonalSecundariaMatrix(m));
    }
    public static int sumDiagonalSecundariaMatrix(int [][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i+j) == (matrix.length-1)) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
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
