package calculadora;

import java.util.Scanner;

public class operacoes {
    Scanner sc = new Scanner(System.in);

    void somar() {


        System.out.println("Digite o primeiro valor:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        System.out.println("a adicao dos numeros é de " + soma);

    }

    void subtrair() {


        System.out.println("Digite o primeiro valor:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int n2 = sc.nextInt();
        int subtracao = n1 - n2;
        System.out.println("a subtracao dos numeros é de " + subtracao);

    }

    void multiplicar() {


        System.out.println("Digite o primeiro valor:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int n2 = sc.nextInt();
        int multiplicacao = n1 * n2;
        System.out.println("a multiplicacao dos numeros é de " + multiplicacao);

    }

    void dividir() {


        System.out.println("Digite o primeiro valor:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int n2 = sc.nextInt();
        int divisao = n1 / n2;
        System.out.println("a divisao dos numeros é de " + divisao);

    }


}
