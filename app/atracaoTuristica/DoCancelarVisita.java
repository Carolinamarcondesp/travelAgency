package app.atracaoTuristica;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.LerInteiro;
import ui.exceptions.DialogException;

public class DoCancelarVisita extends Comando<Agencia> {

    LerInteiro id;
    public DoCancelarVisita(Agencia receptor, String titulo) {
        super(receptor, titulo);

        this.id = new LerInteiro(GestorIdiomas.getLabelpedirIDAtracaoTuristica(receptor.getIdioma()));
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        this.ui.lerInput(this.id);
        if (this.getReceptor().apagaAtracaoTuristica(this.id.getValor())) {
            this.ui.escreveLinha(GestorIdiomas.getLabelAtracaoTuristicaApagadaSucesso(receptor.getIdioma(), this.id.getValor()));
        }else{
            this.ui.escreveLinha(GestorIdiomas.getLabelAtracaoTuristicaNaoExiste(receptor.getIdioma(), this.id.getValor()));
        }

    }
    
}