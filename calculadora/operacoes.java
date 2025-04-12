package calculadora;

import java.util.Scanner;


public class operacoes {

    public static void somar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        double resultado = a + b;
        System.out.println("Resultado da soma: " + resultado);
    }

    public static void subtrair() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        double resultado = a - b;
        System.out.println("Resultado da subtração: " + resultado);
    }

    public static void multiplicar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        double resultado = a * b;
        System.out.println("Resultado da multiplicação: " + resultado);
    }

    public static void dividir() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        if (b != 0) {
            double resultado = a / b;
            System.out.println("Resultado da divisão: " + resultado);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
    }
}
