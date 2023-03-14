package app.restaurante;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;

public class Menu extends ui.Menu{
    
    public Menu(Agencia agencia) {
        super(GestorIdiomas.getLabelMenuRestaurante(agencia.getIdioma()), new Comando<?>[] {

            new DoFazerMarcacao(agencia, GestorIdiomas.getLabelFazerMarcacao(agencia.getIdioma())),
            new DoAlterarMarcacao(agencia, GestorIdiomas.getLabelAlterarMarcacao(agencia.getIdioma())),
            new DoPesquisarMarcacao(agencia, GestorIdiomas.getLabelPesquisarMarcacao(agencia.getIdioma())),
            new DoCancelarMarcacao(agencia, GestorIdiomas.getLabelCancelarMarcacao(agencia.getIdioma()))

        });

    }

}
