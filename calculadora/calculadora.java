package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        operacoes x = new operacoes();


        System.out.println("Digite Seu Nome:");
        String nome = sc.nextLine();
        System.out.println("Olá - " + nome + " - seja bem vindo!.");
        System.out.println("MENU DE OPERACOES");
        System.out.println("ESCOLHA UMA OPCÂO 1 a 5");
        System.out.println("1-ADICAO");
        System.out.println("2-SUBTRACAO");
        System.out.println("3-MULTIPLICACAO");
        System.out.println("4-DIVISAO");
        System.out.println("Escolha uma opcão:");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                x.somar();
                break;
            case 2:
                x.subtrair();
                break;
            case 3:
                x.multiplicar();
                break;
            case 4:
                x.dividir();
                break;
        }


        sc.close();
    }
}
