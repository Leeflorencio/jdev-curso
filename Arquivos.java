import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {

    public static void main(String[] args) throws IOException {

        File arquivo = new File("C:\\beecrown\\arquivo.txt");

        if (!arquivo.exists()){
            arquivo.createNewFile();
        }

        FileWriter escrever_no_arquivo = new FileWriter(arquivo);

        escrever_no_arquivo.write("Meu texto no arquivo");
        escrever_no_arquivo.flush();
        escrever_no_arquivo.close();
    }
}
