package app.restaurante;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.LerInteiro;
import ui.exceptions.DialogException;

public class DoCancelarMarcacao extends Comando<Agencia> {

    LerInteiro id;

    public DoCancelarMarcacao(Agencia receptor, String titulo) {

        super(receptor, titulo);

        this.id = new LerInteiro(GestorIdiomas.getLabelpedirIDRestaurante(receptor.getIdioma()));
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        this.ui.lerInput(this.id);
        if (this.getReceptor().apagaRestaurante(this.id.getValor())) {
            this.ui.escreveLinha(GestorIdiomas.getLabelRestauranteApagadaSucesso(receptor.getIdioma(), this.id.getValor()));
        } else {
            this.ui.escreveLinha(GestorIdiomas.getLabelRestauranteNaoExiste(receptor.getIdioma(), this.id.getValor()));
        }

    }

}