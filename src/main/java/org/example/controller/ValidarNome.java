package org.example.controller;

import java.util.Scanner;

public class ValidarNome {
    public static String executar(Scanner sc) {
        String nome = sc.nextLine();
        for (int i = 0; i < nome.length(); i++) {
            if (!(Character.isAlphabetic((nome.charAt(i))))) {
                System.out.println("O nome nao pode conter números. Digite novamente");
                System.out.print("Nome: ");
                return executar(sc);
            }
        }
        return nome;
    }
}
