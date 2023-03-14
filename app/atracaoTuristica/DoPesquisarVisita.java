package app.atracaoTuristica;

import java.util.ArrayList;

import agencia.AtracaoTuristica;
import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.exceptions.DialogException;

public class DoPesquisarVisita extends Comando<Agencia> {

    public DoPesquisarVisita(Agencia receptor, String titulo) {
        super(receptor, titulo);


    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
       ArrayList<AtracaoTuristica> todosAtracaoTuristica=this.getReceptor().listarAtracaoTuristica();
       this.ui.escreveLinha(GestorIdiomas.getLabelPesquisarVisita(receptor.getIdioma()));
        for (AtracaoTuristica agencia : todosAtracaoTuristica) {
            this.ui.escreveLinha(agencia.toString());
        }

    }
    
}