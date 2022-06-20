package org.example.view;

import org.example.model.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class EscolherAluno {
    public static Aluno executar (Scanner sc, ArrayList<Aluno> listaAlunos) {
        MostrarAlunos.executar(listaAlunos);
        System.out.print("Escreva o codigo do aluno:");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        return listaAlunos.get(index);
    }
}
