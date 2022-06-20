package org.example.model;

import java.util.ArrayList;

public class AlunoComEmail extends Aluno{
    private static String email;

    public AlunoComEmail(String nome, String matricula, String email, ArrayList<Materia> boletim) {
        super(nome, matricula, boletim);
        this.email = email;
    }

    public void enviarParaLista(Aluno alunoComEmail) {
        RepositorioAlunos.adicionarAlunoListaEmail(alunoComEmail);
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
