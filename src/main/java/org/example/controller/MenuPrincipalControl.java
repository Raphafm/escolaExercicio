package org.example.controller;

import org.example.model.Aluno;
import org.example.view.*;
import org.example.model.RepositorioAlunos;

import java.util.Scanner;

public class MenuPrincipalControl {
    public static void run (Scanner sc) {
        MenuPrincipal.run();
        String opcao = sc.nextLine();
        switch (opcao) {
            case "0":
                MenuPrincipal.exit();
                return;
            case "1":
                Aluno aluno = CadastrarAluno.run(sc);
                RepositorioAlunos.adicionarAluno(aluno);
                break;
            case "2":
                LancarNota.executar(sc, EscolherAluno.executar(sc, RepositorioAlunos.getListaAlunos()));
                break;
            case "3":
                aluno = EscolherAluno.executar(sc, RepositorioAlunos.getListaAlunos());
                MostrarBoletim.executar(aluno);
                EnviarBoletim.executar(sc, aluno);
                break;
            default:
                System.out.println("Opção invalida, tente novamente");
                break;
        }
        MenuPrincipalControl.run(sc);
    }
}
