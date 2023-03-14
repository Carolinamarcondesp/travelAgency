package app.atracaoTuristica;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;

public class Menu extends ui.Menu{
    
    public Menu(Agencia agencia) {
        super(GestorIdiomas.getLabelMenuAtracaoTuristica(agencia.getIdioma()), new Comando<?>[] {

            new DoMarcarVisita(agencia, GestorIdiomas.getLabelMarcarVisita(agencia.getIdioma())),
            new DoAlterarVisita(agencia, GestorIdiomas.getLabelAlterarVisita(agencia.getIdioma())),
            new DoPesquisarVisita(agencia, GestorIdiomas.getLabelPesquisarVisita(agencia.getIdioma())),
            new DoCancelarVisita(agencia, GestorIdiomas.getLabelCancelarVisita(agencia.getIdioma()))

        });

    }

}
