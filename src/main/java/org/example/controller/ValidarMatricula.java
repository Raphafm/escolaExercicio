package org.example.controller;

import java.util.Scanner;

public class ValidarMatricula {
    public static String executar(Scanner sc) {
        String matricula = sc.nextLine();

        if (!matricula.matches("[0-9]+")) {
            System.out.println("Matricula invalida, Digite apenas números");
            return executar(sc);
        }

        return matricula;
    }
}
