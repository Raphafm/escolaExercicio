package org.example.model;

import java.util.ArrayList;


public class Aluno {
    private final String nome;
    private final String matricula;
    private final ArrayList<Materia> boletim;

    public Aluno(String nome, String matricula, ArrayList<Materia> boletim) {
        this.nome = nome;
        this.matricula = matricula;
        this.boletim = boletim;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public ArrayList<Materia> getBoletim() {
        return boletim;
    }

    public void enviarParaLista(Aluno aluno) {
        RepositorioAlunos.adicionarAlunoListaImprimir(aluno);
    }
}
