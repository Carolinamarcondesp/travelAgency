package app.main;

import agencia.Agencia;
import agencia.Idiomas;
import app.main.Menu;
import ui.Comando;
import ui.exceptions.DialogException;

public class DoEscolherIdioma extends Comando<Agencia> {

    public DoEscolherIdioma(Agencia receptor, String titulo) {
        super(receptor, titulo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        boolean result = this.getReceptor().trocarIdioma();
        if(result){
            Menu m = new Menu(this.getReceptor());
            m.open();
        }
    }
}
