import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream entradaArquivo = new FileInputStream(
                new File("C:\\beecrown\\arquivo.txt"));

        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

        while (lerArquivo.hasNext()) {
            String linha = lerArquivo.nextLine();

            if (linha != null && !linha.isEmpty()) {
                System.out.println(linha);
            }
        }
    }
}
