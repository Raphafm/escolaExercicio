package org.example.model;

public class Materia implements Comparable<Materia> {
    private final String nome;
    private final int nota;

    public Materia(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public int compareTo(Materia materia) {
        return this.getNome().compareTo(materia.getNome());
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %n", nome, nota);
    }
}
