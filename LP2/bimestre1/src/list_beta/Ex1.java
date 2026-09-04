package list_beta;
import java.util.Scanner;
public class Ex1 {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        m = preenxerMatrix(m);
        int sum = Sum(m);
        System.out.println(sum);
    }
    public static int Sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
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

