package org.example.controller;

import org.example.model.Aluno;
import org.example.model.AlunoComEmail;
import org.example.model.RepositorioAlunos;
import org.example.view.*;

import java.util.Scanner;

public class MenuEnvioControl {
    public static void executar (Scanner sc, Aluno aluno) {
        MenuEnvio.executar();
        String opcao = sc.nextLine();
        switch (opcao) {
            case "0":
                MenuEnvio.exit();
                return;
            case "1":
                System.out.println("Email");
                System.out.println("Qual o Email de destino?");
                String email = sc.nextLine();
                RepositorioAlunos.adicionarAlunoListaEmail(aluno);
                RepositorioAlunos.removerAlunoListaIndefinida(aluno);
                ((AlunoComEmail) aluno).setEmail(email);
                break;
            case "2":
                System.out.println("Celular");
                break;
            case "3":
                System.out.println("Imprimir");
                break;
            default:
                System.out.println("Opção invalida, tente novamente");
                break;
        }
        MenuEnvioControl.executar(sc, aluno);
    }
}
