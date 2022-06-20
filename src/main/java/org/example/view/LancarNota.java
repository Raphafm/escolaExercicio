package org.example.view;

import org.example.controller.ValidarNumero;
import org.example.model.Aluno;
import org.example.model.Materia;

import java.util.Objects;
import java.util.Scanner;

public class LancarNota {
    public static void executar(Scanner sc, Aluno aluno) {
        System.out.println("Qual o nome da materia?");
        String nome = sc.nextLine();
        System.out.println("Qual foi a nota do aluno nessa materia");
        double nota = ValidarNumero.executar(sc);
        sc.nextLine();

        aluno.getBoletim().add(new Materia(nome, nota));

        continuarLancando(sc, aluno);
    }

    private static void continuarLancando (Scanner sc, Aluno aluno) {
        do {
            System.out.println("Digite 1 para continuar lançando notas");
            System.out.println("Digite 2 para voltar para o menu principal");
            String opcao = sc.nextLine();

            if (Objects.equals(opcao, "1")) {
                LancarNota.executar(sc, aluno);
                return;
            } else if (Objects.equals(opcao, "2")) {
                return;
            } else {
                System.out.println("Opcao invalida, digite novamente");
            }
        } while (true);
    }
}
