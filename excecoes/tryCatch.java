package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {

        method1();

        System.out.println("end of program...");//agora essa mensagem é vista ,pois o codigo esta tratando os erros que podem aconteceer na execução

    }

    public static void method1(){
        System.out.println("*** METHOD 1 START ***");
        method2();
        System.out.println("*** METHOD 2 END ***");


    }




    public static void method2() {
        System.out.println("*** METHOD 2 START ***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");

            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position!"); //tratamento de erro de posição
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("input error!"); //tratamento de erro de inserção de letra na posicao do vetor
        }
        sc.close();
        System.out.println("*** METHOD2 END ***");
    }
}
