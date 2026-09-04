import java.util.Scanner;
public class MB_1174 {
    public final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {  
        double [] v = new double[100];
        for (int i = 0; i < v.length; i++) {
            v[i] = S.nextDouble(); 
        }
        for (int i = 0; i < v.length; i++) {
            if (v[i] <= 10) {
                System.out.printf("A[" + i + "] = %.1f%n", v[i]);
            }
        }

    }
}
