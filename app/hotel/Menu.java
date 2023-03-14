package app.hotel;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;

public class Menu extends ui.Menu{
    
    public Menu(Agencia agencia) {
        super(GestorIdiomas.getLabelMenuHotel(agencia.getIdioma()), new Comando<?>[] {

            new DoFazerReserva(agencia, GestorIdiomas.getLabelFazerReserva(agencia.getIdioma())),
            new DoAlterarReserva(agencia, GestorIdiomas.getLabelAlterarReserva(agencia.getIdioma())),
            new DoPesquisarReserva(agencia, GestorIdiomas.getLabelPesquisarReserva(agencia.getIdioma())),
            new DoCancelarReserva(agencia, GestorIdiomas.getLabelCancelarReserva(agencia.getIdioma()))

        });

    }

}
