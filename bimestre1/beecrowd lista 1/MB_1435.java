import java.util.Scanner;

public class MB_1435 {
    final static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int n = S.nextInt();
            if (n == 0) {
                break;
            }
            int matrix[][] = new int[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    int b = Math.min(i, j);
                    int a = Math.min((n - 1 - i), (n - 1 - j));
                    int c = Math.min(a, b) + 1;
                    if (j == 0) {
                        System.out.print(" " + c);
                    } else {
                        System.out.print("   " + c);
                    }
                }
                System.out.println();
            }
            
        }

    }

    public static int[] lerVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = S.nextInt();
        }
        return v;
    }

}
