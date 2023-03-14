package app.restaurante;

import java.util.ArrayList;

import agencia.Restaurante;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import agencia.Agencia;
import ui.Comando;
import ui.exceptions.DialogException;

public class DoPesquisarMarcacao extends Comando<Agencia> {

    public DoPesquisarMarcacao(Agencia receptor, String titulo) {
        super(receptor, titulo);

    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        ArrayList<Restaurante> todosRestaurante = this.getReceptor().listarRestaurante();
        this.ui.escreveLinha(GestorIdiomas.getLabelPesquisarMarcacao(receptor.getIdioma()));
        for (Restaurante agencia : todosRestaurante) {
            this.ui.escreveLinha(agencia.toString());
        }

    }

}