package manipulacaoArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning","good afternoon","Good night"};
        String path = "c:\\temp\\teste.txt.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for(String line :lines){
                bw.write(line);
                bw.newLine();
            }

        }catch (IOException e){
            System.out.println("error"+e.getMessage());
        }
    }
}
