package com.br.jdev;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivosCsv {

    public static void main(String[] args) throws IOException {

        File arquivo = new File("C:\\jdev-treinamento\\java-jdev\\arquivo.csv");

        if (!arquivo.exists()){
            arquivo.createNewFile();
        }

        FileWriter escrever_no_arquivo = new FileWriter(arquivo);

        escrever_no_arquivo.write("Meu texto no arquivo csv");
        escrever_no_arquivo.flush();
        escrever_no_arquivo.close();
    }
}
