import java.util.Scanner;

public class MB_1175 {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int v[] = new int[20];

        for (int i = 0; i < v.length; i++) {
            v[i] = S.nextInt();
        }

        for (int i = 0; i < (int)v.length/2; i++) {
            int aux = v[i];
            v[i] = v[v.length-1-i];
            v[v.length-i-1] = aux;
        }
        
        for (int i = 0; i < v.length; i++) {
            System.out.println("N["+i+"] = "+ v[i]);
        }

    }
}
