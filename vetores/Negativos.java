package vetores;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos numeros vc vai digitar?");
        int n = sc.nextInt();
        int[] inteiros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("digite um numero: ");
            inteiros[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            if (inteiros[i] < 0){
                System.out.println(inteiros[i]);
            }

        }



    }
}
