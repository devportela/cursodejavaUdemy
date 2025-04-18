package excecoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class finaly{ //arquivo que usa files e verifica o arquivo in.txt e imprime na tela o conteudo do mesmo
    //será estudado mais pra frente no curso //


    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("finally block executed");
        }
    }
}

