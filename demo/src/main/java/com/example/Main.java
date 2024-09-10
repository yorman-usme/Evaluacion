package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese la operación a realizar (+, -, *, /, %).");
        char operacion = scanner.next().charAt(0);

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        double resultado = 0;

        if (operacion == '+') {
            resultado = numero1 + numero2;
        }else if (operacion == '-') {
            resultado = numero1 - numero2;
        }else if (operacion == '*') {
            resultado = numero1 * numero2;
        }else if (operacion == '/') {
            if (numero2 != 0) {
                resultado= numero1/numero2;
            }else {
                System.out.println("ERROR");
                
        }
            
        }else if (operacion == '%') {
            resultado= numero1%numero2;
        }
        System.out.println("el resultado es: " + resultado);

    }
}
