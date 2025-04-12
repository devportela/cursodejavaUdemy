package calculadora;

import java.util.Scanner;

public class calculadora extends operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Seu Nome:");
        String nome = sc.nextLine();
        System.out.println("Olá - " + nome + " - seja bem vindo!.");
        System.out.println("MENU DE OPERACOES");
        System.out.println("ESCOLHA UMA OPCÃO 1 a 4");
        System.out.println("1 - ADICAO");
        System.out.println("2 - SUBTRACAO");
        System.out.println("3 - MULTIPLICACAO");
        System.out.println("4 - DIVISAO");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                somar();
                break;
            case 2:
                subtrair();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
