package app.restaurante;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.Constantes;
import ui.LerString;
import ui.exceptions.DialogException;

public class DoFazerMarcacao extends Comando<Agencia> {
    private LerString nomeRestaurante;
    private LerString localRestaurante;
    private LerString dataRestaurante;
    private LerString horaRestaurante;
    private LerString paxRestaurante;

    public DoFazerMarcacao(Agencia receptor, String titulo) {
        super(receptor, titulo);

        this.nomeRestaurante = new LerString(GestorIdiomas.getLabelpedirNomeRestaurante(receptor.getIdioma()), null);
        this.localRestaurante = new LerString(GestorIdiomas.getLabelpedirLocalRestaurante(receptor.getIdioma()), null);
        this.dataRestaurante = new LerString(GestorIdiomas.getLabelpedirDataRestaurante(receptor.getIdioma()), Constantes.DATE_REGEX);
        this.horaRestaurante = new LerString(GestorIdiomas.getLabelpedirHoraRestaurante(receptor.getIdioma()), Constantes.TIME_REGEX);
        this.paxRestaurante = new LerString(GestorIdiomas.getLabelpedirPaxRestaurante(receptor.getIdioma()), null);

    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        this.ui.lerInput(this.nomeRestaurante);
        this.ui.lerInput(this.localRestaurante);
        this.ui.lerInput(this.dataRestaurante);
        this.ui.lerInput(this.horaRestaurante);
        this.ui.lerInput(this.paxRestaurante);

        System.out.println(GestorIdiomas.getLabeldevolveNomeRestaurante(receptor.getIdioma()) + this.nomeRestaurante.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveLocalRestaurante(receptor.getIdioma()) + this.localRestaurante.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveDataRestaurante(receptor.getIdioma()) + this.dataRestaurante.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveHoraRestaurante(receptor.getIdioma()) + this.horaRestaurante.getValor());
        System.out.println(GestorIdiomas.getLabeldevolvePaxRestaurante(receptor.getIdioma()) + this.paxRestaurante.getValor());

        boolean result = this.getReceptor().criarRestaurante(nomeRestaurante.getValor(), localRestaurante.getValor(), dataRestaurante.getValor(), this.horaRestaurante.getValor(), this.paxRestaurante.getValor());
        if (result) {
            this.ui.escreveLinha(GestorIdiomas.getLabelMsgSucessoRestaurante(receptor.getIdioma()));
        } else
            this.ui.escreveLinha(GestorIdiomas.getLabelMsgErroRestaurante(receptor.getIdioma()));
    }
}