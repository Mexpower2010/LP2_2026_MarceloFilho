import java.util.Scanner;  
public class MB_1042 {
    public static final Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int v[] = new int[3];
        for (int i = 0; i < v.length; i++) {
            v[i] = S.nextInt();
        }
        int v1[] = v.clone();
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v1[j]>v1[i]) {
                    int aux = v1[i];
                    v1[i] = v1[j];
                    v1[j] = aux;
                }
            }
        }
        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1[i]);
        }
        System.out.println(); 
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
