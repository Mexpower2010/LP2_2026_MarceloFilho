import java.util.Scanner;

public class MB_1176 {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int[] v = new int[S.nextInt()];
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < v.length; i++) {
            v[i] = S.nextInt();
            if (v[i] > maior) {
                maior = v[i];
            }
        }

        if (maior == 0) {
            for (int i = 0; i < v.length; i++) {
                System.out.println("Fib(0) = 0");
            }
        } else if (maior == 1) {
            for (int i = 0; i < v.length; i++) {
                if (v[i] == 1) {
                    System.out.println("Fib(1) = 1");
                } else {
                    System.out.println("Fib(0) = 0");
                }
            }
        } else {
            long f[] = new long[maior + 1]; 
            f[0] = 0;
            f[1] = 1;

            for (int i = 2; i < f.length; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }

            for (int i = 0; i < v.length; i++) {
                System.out.println("Fib(" + v[i] + ") = " + f[v[i]]);
            }
        }
    }
}