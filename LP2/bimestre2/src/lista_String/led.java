package lista_String;
import java.util.Scanner;
public class led{
    final static public Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            char[] led = s.next().toCharArray();
            int qtdLed = 0;
            for (int j = 0; j < led.length; j++) {
                qtdLed += definirLed(led[j]);
            }
            System.out.println(qtdLed + " leds");
        }
    }
    public static int definirLed(char c){
        switch (c) {
            case '1':
                return 2;
            case '2':
                return 5;
            case '3':
                return 5;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 3;
            case '8':
                return 7;
            case '9':
                return 6;
            case '0':
                return 6;
        }
        return 0;
    }
}