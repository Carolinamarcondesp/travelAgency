package app.restaurante;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.Constantes;
import ui.LerString;
import ui.LerInteiro;
import ui.exceptions.DialogException;

public class DoAlterarMarcacao extends Comando<Agencia> {

    private LerInteiro id;
    private LerString dataRestaurante;
    private LerString horaRestaurante;
    private LerString paxRestaurante;

    public DoAlterarMarcacao(Agencia receptor, String titulo) {
        super(receptor, titulo);

        this.id = new LerInteiro(GestorIdiomas.getLabelpedirIDRestaurante(receptor.getIdioma()));
        this.dataRestaurante = new LerString(GestorIdiomas.getLabelpedirDataRestaurante(receptor.getIdioma()), Constantes.DATE_REGEX);
        this.horaRestaurante = new LerString(GestorIdiomas.getLabelpedirHoraRestaurante(receptor.getIdioma()), Constantes.TIME_REGEX);
        this.paxRestaurante = new LerString(GestorIdiomas.getLabelpedirPaxRestaurante(receptor.getIdioma()), null);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        this.ui.lerInput(this.id);
        if (this.getReceptor().RestauranteExiste(this.id.getValor())) {

            this.ui.lerInput(this.dataRestaurante);
            this.ui.lerInput(this.horaRestaurante);
            this.ui.lerInput(this.paxRestaurante);
            this.getReceptor().alteraNomeRestaurante(this.id.getValor(), this.dataRestaurante.getValor(),
                    this.horaRestaurante.getValor(), this.paxRestaurante.getValor());
            this.ui.escreveLinha(GestorIdiomas.getLabeldataAlteradaSucessoRestaurante(receptor.getIdioma()));
            this.ui.escreveLinha(GestorIdiomas.getLabelhoraAlteradaSucessoRestaurante(receptor.getIdioma()));
            this.ui.escreveLinha(GestorIdiomas.getLabelpaxAlteradaSucessoRestaurante(receptor.getIdioma()));
        } else {
            this.ui.escreveLinha(GestorIdiomas.getLabelRestauranteNaoExiste(receptor.getIdioma(), this.id.getValor()));
        }

    }

}