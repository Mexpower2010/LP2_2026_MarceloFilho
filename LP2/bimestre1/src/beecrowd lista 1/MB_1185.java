import java.util.Scanner;
public class MB_1185 {
    final static public Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        char o = S.next().charAt(0);
        double[][] m = new double[12][12];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) { 
                m[i][j] = S.nextDouble();
            }
        }
        double sum = 0;
        int cont = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (j+i < 11) {
                    sum += m[i][j];
                    cont++;}
            }
        }
        if (o == 'S') {
            System.out.printf("%.1f\n", sum);
        } else {
            System.out.printf("%.1f\n", sum / cont);
        }
    }
}