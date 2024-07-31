package com.br.jdev;

import javax.swing.*;

public class AulaThreads {

    public static void main(String[] args) throws InterruptedException {

        Thread threadEmail = new Thread(thread1);
        threadEmail.start();

        Thread threadNotaFiscal = new Thread(thread2);
        threadNotaFiscal.start();

        JOptionPane.showMessageDialog(null, "sistema continua executando para o usuario");
    }

    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            //codigo da rotina
            for (int pos = 0; pos < 5; pos++){

                System.out.println("Inicio da rotina, envio de email...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Fim da Thread 1");
        }
    };

    private static Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            for (int pos = 0; pos < 10; pos++){

                System.out.println("Envio de nota fiscal...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Fim da Thread 2");
        }
    };
}
