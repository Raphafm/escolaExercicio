package org.example;

import org.example.controller.MenuPrincipalControl;
import org.example.model.RepositorioAlunos;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        RepositorioAlunos.inicialziar();

        MenuPrincipalControl.run(sc);
    }
}
