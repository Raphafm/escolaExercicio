package org.example.model;

import java.util.ArrayList;

public class AlunoComCelular extends Aluno
{
    private final String celular;

    public AlunoComCelular(String nome, String matricula, String celular, ArrayList<Materia> boletim) {
        super(nome, matricula, boletim);
        this.celular = celular;
    }

    @Override
    public void enviarParaLista(Aluno alunoComCelular) {
        System.out.printf("O boletim do aluno %s foi enviado com sucesso para o celular %s%n", alunoComCelular.getNome(),
                ((AlunoComCelular)alunoComCelular).getCelular());

    }

    public String getCelular() {
        return celular;
    }
}
