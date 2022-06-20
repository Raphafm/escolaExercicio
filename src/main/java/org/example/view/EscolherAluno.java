package org.example.view;

import org.example.controller.ValidarNumero;
import org.example.model.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class EscolherAluno {
    public static Aluno executar (Scanner sc, ArrayList<Aluno> listaAlunos) {
        MostrarAlunos.executar(listaAlunos);
        System.out.print("Escreva o codigo do aluno:");
        try{
            int index = ValidarNumero.executar(sc).intValue() - 1;
            sc.nextLine();
            return listaAlunos.get(index);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Codigo inexistente, tente novamente");
            return EscolherAluno.executar(sc, listaAlunos);
        }
    }
}
