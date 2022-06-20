package org.example.view;

import org.example.controller.ValidarMatricula;
import org.example.controller.ValidarNome;
import org.example.model.Materia;
import org.example.model.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarAluno {
    public static Aluno run(Scanner sc) {
        System.out.println("Qual o nome do aluno?");
        String nome = ValidarNome.executar(sc);

        System.out.println("Qual é a matricula do aluno");
        String matricula = ValidarMatricula.executar(sc);

        ArrayList<Materia> boletim = new ArrayList<>();

        return new Aluno(nome, matricula, boletim);
    }
}
