package app.atracaoTuristica;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.Constantes;
import ui.LerString;
import ui.exceptions.DialogException;

public class DoMarcarVisita extends Comando<Agencia> {

    private LerString nomeAtracaoTuristica;
    private LerString localAtracaoTuristica;
    private LerString dataAtracaoTuristica;
    private LerString horaAtracaoTuristica;
    private LerString paxAtracaoTuristica;

    public DoMarcarVisita(Agencia receptor, String titulo) {
        super(receptor, titulo);

        this.nomeAtracaoTuristica=new LerString(GestorIdiomas.getLabelpedirNomeAtracaoTuristica(receptor.getIdioma()), null);
        this.localAtracaoTuristica=new LerString(GestorIdiomas.getLabelpedirLocalAtracaoTuristica(receptor.getIdioma()), null);
        this.dataAtracaoTuristica=new LerString(GestorIdiomas.getLabelpedirDataAtracaoTuristica(receptor.getIdioma()), Constantes.DATE_REGEX);
        this.horaAtracaoTuristica=new LerString(GestorIdiomas.getLabelpedirHoraAtracaoTuristica(receptor.getIdioma()), Constantes.TIME_REGEX);
        this.paxAtracaoTuristica=new LerString(GestorIdiomas.getLabelpedirPaxAtracaoTuristica(receptor.getIdioma()), null);

    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        this.ui.lerInput(this.nomeAtracaoTuristica);
        this.ui.lerInput(this.localAtracaoTuristica);
        this.ui.lerInput(this.dataAtracaoTuristica);
        this.ui.lerInput(this.horaAtracaoTuristica);
        this.ui.lerInput(this.paxAtracaoTuristica);

        System.out.println(GestorIdiomas.getLabeldevolveNomeAtracaoTuristica(receptor.getIdioma()) + this.nomeAtracaoTuristica.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveLocalAtracaoTuristica(receptor.getIdioma()) + this.localAtracaoTuristica.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveDataAtracaoTuristica(receptor.getIdioma()) + this.dataAtracaoTuristica.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveHoraAtracaoTuristica(receptor.getIdioma()) + this.horaAtracaoTuristica.getValor());
        System.out.println(GestorIdiomas.getLabeldevolvePaxAtracaoTuristica(receptor.getIdioma()) + this.paxAtracaoTuristica.getValor());

        boolean result = this.getReceptor().criarAtracaoTuristica(nomeAtracaoTuristica.getValor(), localAtracaoTuristica.getValor(), dataAtracaoTuristica.getValor(), this.horaAtracaoTuristica.getValor(), this.paxAtracaoTuristica.getValor());
        if(result){
            this.ui.escreveLinha(GestorIdiomas.getLabelMsgSucessoAtracaoTuristica(receptor.getIdioma()));
        }
        else
        this.ui.escreveLinha(GestorIdiomas.getLabelMsgErroAtracaoTuristica(receptor.getIdioma()));
    }
    
}