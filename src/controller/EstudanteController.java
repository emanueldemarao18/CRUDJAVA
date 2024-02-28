package controller;

import entities.Estudante;

import java.util.ArrayList;
import java.util.List;

public class EstudanteController {

    private List<Estudante> estudantes;

    public EstudanteController() {
        this.estudantes = new ArrayList<>();
    }

    public void addEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public String buscarEstudante(String nome) {
        for(Estudante estudante: estudantes) {
            if(estudante.getNome().equalsIgnoreCase(nome)) {
                return "Estudante encontrado"+estudante.getNome()+":"+estudante.getNota();
            }
        }
        return "Não encontrado";
    }

  
}
