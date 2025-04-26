package manipulacaoArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) { //codigo para ler o conteudo do arquivo teste.txt e mostrar na tela

        File file = new File("C:\\temp\\in.txt.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) ;{

                System.out.println(sc.hasNextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if(sc != null) {
                sc.close();
            }
        }

    }
}
