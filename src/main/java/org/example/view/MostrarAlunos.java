package org.example.view;

import org.example.model.Aluno;

import java.util.ArrayList;


public class MostrarAlunos {
    public static void executar (ArrayList<Aluno> listaAlunos) {
        System.out.println();
        System.out.printf("%-10s %-20s %-20s %n", "Codigo", "Nome", "Matricula");
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.printf("%-10d %-20s %-20s %n", i + 1,  listaAlunos.get(i).getNome(), listaAlunos.get(i).getMatricula());
        }
    }
}
