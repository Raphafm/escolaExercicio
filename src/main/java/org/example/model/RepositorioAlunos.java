package org.example.model;

import java.util.ArrayList;

public class RepositorioAlunos {

    private static ArrayList<Aluno> listaAlunos;



    public static void inicialziar(){
        listaAlunos = new ArrayList<>();
        ArrayList<Materia> boletim1 = new ArrayList<>();
        Aluno aluno1 = new Aluno("Raphael", "123", boletim1);
        adicionarAluno(aluno1);
    }

    public static void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public static ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }


}
