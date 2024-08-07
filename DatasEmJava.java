package com.br.jdev;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataVencimento = dateFormat.parse("05/08/2024");
        Date dataAtual = dateFormat.parse("06/08/2024");

        //after: se a data 1 é maior que a data 2
        //before: se a data 1 é menor que a data 2

        if (dataVencimento.before(dataAtual)){
            System.out.println("Boleto vencido");
        }else {
            System.out.println("Boleto em dia");
        }
    }
}
