package list_beta;

public class Ex2 {
    public static void main(String[] args) {
        int[][] m = new int[6][6];
        m = preenxerMatrix(m);
        System.out.println(sumDiagonalPrincipalMatrix(m));
        
    }
    public static int sumDiagonalPrincipalMatrix(int [][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i==j) {
                    sum = matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int[][] preenxerMatrix(int[][] matrix) {
        for ( int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]= (2*i) + (j*j);
            }
        }
        return matrix;
        
     }
}
