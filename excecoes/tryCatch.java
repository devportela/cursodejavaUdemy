package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split("");

            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position!"); //tratamento de erro de posição
        } catch (InputMismatchException e) {
            System.out.println("input error!"); //tratamento de erro de inserção de letra na posicao do vetor
        }


        System.out.println("end of program...");//agora essa mensagem é vista ,pois o codigo esta tratando os erros que podem aconteceer na execução
        sc.close();
    }
}
