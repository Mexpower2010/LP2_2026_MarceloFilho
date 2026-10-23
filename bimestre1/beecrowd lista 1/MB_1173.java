import java.util.Scanner;
public class MB_1173 {
    public final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int[] v = new int[10];
        v[0] = S.nextInt();
        for (int i = 1; i < v.length; i++) {
            v[i] = v[i - 1] * 2;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println("N[" + i + "] = " + v[i]);
        } 
    
}
}