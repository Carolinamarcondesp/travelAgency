package app.main;

import agencia.Agencia;
import app.hotel.Menu;
import ui.Comando;
import ui.exceptions.DialogException;

public class DoAbrirMenuHotel extends Comando<Agencia> {

    public DoAbrirMenuHotel(Agencia receptor, String titulo) {
        super(receptor, titulo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        Menu m = new Menu(this.getReceptor());
        m.open();
        
    }
    

}
