package org.example.model;

import java.util.ArrayList;

public class RepositorioAlunos {

    private static ArrayList<Aluno> listaAlunos;
    private static ArrayList<AlunoComEmail> listaEnviarBoletimEmail;
    private static ArrayList<AlunoComCelular> listaEnviarBoletimCelular;
    private static ArrayList<Aluno> listaImprimirBoletim;
    private static ArrayList<Aluno> listaBoletoIndefinido;


    public static void inicialziar(){
        listaAlunos = new ArrayList<>();
        listaBoletoIndefinido = new ArrayList<>();
        listaEnviarBoletimEmail = new ArrayList<>();
        listaEnviarBoletimCelular = new ArrayList<>();
        listaImprimirBoletim = new ArrayList<>();
        ArrayList<Materia> boletim1 = new ArrayList<>();
        Aluno aluno1 = new Aluno("Raphael", "123", boletim1);
        adicionarAluno(aluno1);
        adicionarAlunoListaIndefinida(aluno1);
    }

    public static void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public static void adicionarAlunoListaImprimir(Aluno aluno){
        listaImprimirBoletim.add(aluno);
    }

    public static void adicionarAlunoListaEmail(Aluno aluno){
        listaEnviarBoletimEmail.add((AlunoComEmail) aluno);
    }

    public static void adicionarAlunoListaCelular(Aluno aluno){
        listaEnviarBoletimCelular.add((AlunoComCelular) aluno);
    }

    public static void adicionarAlunoListaIndefinida(Aluno aluno){
        listaBoletoIndefinido.add(aluno);
    }

    public static void removerAlunoListaIndefinida(Aluno aluno){
        listaBoletoIndefinido.remove(aluno);
    }

    public static ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }


}
