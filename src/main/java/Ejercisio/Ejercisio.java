package Ejercisio;

import java.util.Scanner;

public class Ejercisio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1;
        int n2;
        System.out.println(" por favor introducir el primer numero");
        n1 = entrada.nextInt();
        System.out.println(" por favor introducir el segundo numero");
        n2 = entrada.nextInt();

        if (n1 % 2 == 0 && n2 % 2 == 0) {
            System.out.println("son numeros pares  " + n1 + n2);
        }
        if (n1 % 2 == 0 && n2 % 2 != 0) {
            System.out.println(" el primer es par " + n1 + "el segundo numero es impar " + n2);
        }
        if (n1 % 2 != 0 && n2 % 2 == 0) {
            System.out.println("el primer numero es impar" + n1 + "el segundo numero es par" + n2);
        }
        if (n1 % 2 != 0 && n2 % 2 != 0) {
            System.out.println(" el primer es impar " + n1 + "el segundo numero es impar " + n2);
        }
        System.out.println(" prueba 1");

    }

}
