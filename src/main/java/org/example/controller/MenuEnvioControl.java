package org.example.controller;

import org.example.model.Aluno;
import org.example.model.AlunoComCelular;
import org.example.model.AlunoComEmail;
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
                System.out.println("Qual o Email de destino?");
                String email = sc.nextLine();
                AlunoComEmail alunoComEmail = new AlunoComEmail(aluno.getNome(), aluno.getMatricula(), email,
                        aluno.getBoletim());
               alunoComEmail.enviarParaLista(alunoComEmail);
                break;
            case "2":
                System.out.println("Qual o Celular de destino?");
                String celular = sc.nextLine();
                AlunoComCelular alunoComCelular = new AlunoComCelular(aluno.getNome(), aluno.getMatricula(), celular,
                        aluno.getBoletim());
                alunoComCelular.enviarParaLista(alunoComCelular);
                break;
            case "3":
                aluno.enviarParaLista(aluno);
                break;
            default:
                System.out.println("Opção invalida, tente novamente");
                break;
        }
        MenuEnvioControl.executar(sc, aluno);
    }
}
