package app.hotel;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.LerInteiro;
import ui.exceptions.DialogException;

public class DoCancelarReserva extends Comando<Agencia> {

    LerInteiro id;
    public DoCancelarReserva(Agencia receptor, String titulo) {
        super(receptor, titulo);

        this.id = new LerInteiro(GestorIdiomas.getLabelpedirIDHotel(receptor.getIdioma()));
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        this.ui.lerInput(this.id);
        if (this.getReceptor().apagaHotel(this.id.getValor())) {
            this.ui.escreveLinha(GestorIdiomas.getLabelHotelApagadaSucesso(receptor.getIdioma(), this.id.getValor()));
        }else{
            this.ui.escreveLinha(GestorIdiomas.getLabelHotelNaoExiste(receptor.getIdioma(), this.id.getValor()));
        }
    }
    
}