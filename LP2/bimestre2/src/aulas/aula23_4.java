package aulas;
/* 
-->Crie um programa que:
    solicite uma frase ao usuario
    exiba a frase em maiusculas e minusculas
    mostre o numero de caracteres da frase
    extraia e exiba os tres primeiros caracteres
*/

import java.util.Scanner;
public class aula23_4 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        
/* colinha
String texto = "java";
System.out.println(texto.toUpperCase());
texto = "JAVA";
System.out.println(texto.toLowerCase());
texto = "java";
System.out.println(texto.length());
texto = "Java";
for (int i = 0; i < texto.length(); i++) {
System.out.println(texto.charAt(i));
}
texto = "Java";
for (char c : texto.toCharArray()) {
System.out.println(c);
}*/

        System.out.println("Digite uma frase: ");
        String frase = LER.next();

        printFraseMaiuscula(frase);

        printFraseMinuscula(frase);

        System.out.println("Número de caracteres da frase: " + frase.length());

        for (char c : frase.toCharArray()) {
            System.out.println(c);
        }
    }

    public static void printFraseMinuscula(String frase) {
        System.out.println(frase.toLowerCase());
    }

    public static void printFraseMaiuscula(String frase) {
        System.out.println(frase.toUpperCase());
    }
}