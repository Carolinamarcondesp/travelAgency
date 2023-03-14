package app.main;

import agencia.Agencia;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.exceptions.DialogException;

public class Menu extends ui.Menu {

    public Menu(Agencia agencia) {

        super(GestorIdiomas.getLabelMenuPrincipal(agencia.getIdioma()), new Comando<?>[]{
            new DoEscolherIdioma(agencia, GestorIdiomas.getLabelEscolherIdioma(agencia.getIdioma())),
            new DoCriarCliente(agencia, GestorIdiomas.getLabelCriarCliente(agencia.getIdioma())),
            new DoListarClientes(agencia, GestorIdiomas.getLabelListarClientes(agencia.getIdioma())),
            new DoAbrirMenuHotel(agencia, GestorIdiomas.getLabelAbrirMenuHotel(agencia.getIdioma())),
            new DoAbrirMenuRestaurante(agencia, GestorIdiomas.getLabelAbrirMenuRestaurante(agencia.getIdioma())),
            new DoAbrirMenuAtracaoTuristica(agencia, GestorIdiomas.getLabelAbrirMenuAtracaoTuristica(agencia.getIdioma()))

        });

    }

}
