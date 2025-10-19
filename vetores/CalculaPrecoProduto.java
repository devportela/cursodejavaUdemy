package vetores;

import vetores.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class CalculaPrecoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n]; //vetor tipo referencia
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produto(name, price);
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();

        }
        double avg = sum / n;
        System.out.println("AVERAGE PRICE" + avg);
        //vetor tipo referencia são tipo null
        //por isso temos que instanciar a classe produto

        //atributo .lenght = tamanho do vetor
        // vect.lenght = vect[n]


    }
}
