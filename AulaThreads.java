package com.br.jdev;

import javax.swing.*;

public class AulaThreads {

    public static void main(String[] args) throws InterruptedException {

        new Thread() {

            public void run(){//codigo da rotina
                for (int pos = 0; pos < 5; pos++){

                    System.out.println("Inicio da rotina, envio de email...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("Fim da Thread 1");
            };

        }.start(); // inicia a thread paralelamente

        //divisao

        new Thread() {

            public void run(){//codigo da rotina
                for (int pos = 0; pos < 5; pos++){

                    System.out.println("Envio de nota fiscal...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("Fim da Thread 2");
            };

        }.start();

        JOptionPane.showMessageDialog(null, "sistema continua executando para o usuario");
    }
}
