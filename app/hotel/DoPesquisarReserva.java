package app.hotel;

import java.util.ArrayList;

import agencia.Hotel;
import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.exceptions.DialogException;

public class DoPesquisarReserva extends Comando<Agencia> {

    public DoPesquisarReserva(Agencia receptor, String titulo) {
        super(receptor, titulo);


    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        ArrayList<Hotel> todosHotel=this.getReceptor().listarHotel();
       this.ui.escreveLinha(GestorIdiomas.getLabelPesquisarReserva(receptor.getIdioma()));
        for (Hotel agencia : todosHotel) {
            this.ui.escreveLinha(agencia.toString());
        }

    }
    
}