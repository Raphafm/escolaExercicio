package org.example.model;

import java.util.ArrayList;

public class AlunoComCelular extends Aluno
{
    private String celular;

    public AlunoComCelular(String nome, String matricula, String celular, ArrayList<Materia> boletim) {
        super(nome, matricula, boletim);
        this.celular = celular;
    }

    public void enviarParaLista(Aluno alunoComCelular) {
        RepositorioAlunos.adicionarAlunoListaCelular(alunoComCelular);
    }


}
