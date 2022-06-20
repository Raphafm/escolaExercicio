package org.example.view;

import org.example.model.Aluno;

public class MostrarBoletim {
    public static void executar(Aluno aluno){
        System.out.println();
        System.out.printf("%-20s %-20s %n", "Nome", "Matricula");
        System.out.printf("%-20s %-20s %n%n", aluno.getNome(), aluno.getMatricula());
        System.out.printf("%-20s %-20s %n", "Materia", "Nota");
        for (int i = 0; i < aluno.getBoletim().size(); i++) {
            System.out.printf("%-20s %-20d %n", aluno.getBoletim().get(i).getNome(), aluno.getBoletim().get(i).getNota());
        }

    }

}
