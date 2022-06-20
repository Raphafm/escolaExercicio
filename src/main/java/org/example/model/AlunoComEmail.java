package org.example.model;

import java.util.ArrayList;

public class AlunoComEmail extends Aluno{
    private final String email;

    public AlunoComEmail(String nome, String matricula, String email, ArrayList<Materia> boletim) {
        super(nome, matricula, boletim);
        this.email = email;
    }

    @Override
    public void enviarParaLista(Aluno alunoComEmail) {
        System.out.printf("O boletim do aluno %s foi enviado com sucesso para o email %s%n", this.getNome(),
                this.getEmail());
    }

    public String getEmail() {
        return email;
    }
}
