package vetores;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("digite o tamanho do vetor desejado:");
        int n = sc.nextInt();
        //criação de vetor
        double[] vect = new double[n]; //indica a declaração de um vetor

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double avg = soma / n;
        System.out.println("AVERAGE HEIGHT:" + avg);

    }
}
