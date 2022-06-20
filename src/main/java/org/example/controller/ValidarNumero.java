package org.example.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarNumero {
    public static Double executar(Scanner sc) {
        try {
            return sc.nextDouble();
        } catch (InputMismatchException ex) {
            sc.nextLine();
            System.out.println("Não digite letras, por favor");
            System.out.print("Nova resposta: ");
            return executar(sc);
        }
    }
}
