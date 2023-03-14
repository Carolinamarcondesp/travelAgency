package app.atracaoTuristica;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.Constantes;
import ui.LerString;
import ui.LerInteiro;
import ui.exceptions.DialogException;

public class DoAlterarVisita extends Comando<Agencia> {

    private LerInteiro id;
    private LerString dataAtracaoTuristica;
    private LerString horaAtracaoTuristica;
    private LerString paxAtracaoTuristica;

    public DoAlterarVisita(Agencia receptor, String titulo) {
        super(receptor, titulo);

        this.id = new LerInteiro(GestorIdiomas.getLabelpedirIDAtracaoTuristica(receptor.getIdioma()));
        this.dataAtracaoTuristica=new LerString(GestorIdiomas.getLabelpedirDataAtracaoTuristica(receptor.getIdioma()), Constantes.DATE_REGEX);
        this.horaAtracaoTuristica=new LerString(GestorIdiomas.getLabelpedirHoraAtracaoTuristica(receptor.getIdioma()), Constantes.TIME_REGEX);
        this.paxAtracaoTuristica=new LerString(GestorIdiomas.getLabelpedirPaxAtracaoTuristica(receptor.getIdioma()), null);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        this.ui.lerInput(this.id);
        if (this.getReceptor().AtracaoTuristicaExiste(this.id.getValor())) {
            
            this.ui.lerInput(this.dataAtracaoTuristica);
            this.ui.lerInput(this.horaAtracaoTuristica);
            this.ui.lerInput(this.paxAtracaoTuristica);
            this.getReceptor().alteraNomeAtracaoTuristica(this.id.getValor(), this.dataAtracaoTuristica.getValor(), this.horaAtracaoTuristica.getValor(), this.paxAtracaoTuristica.getValor());
            this.ui.escreveLinha(GestorIdiomas.getLabeldataAlteradaSucessoAtracaoTuristica(receptor.getIdioma()));
            this.ui.escreveLinha(GestorIdiomas.getLabelhoraAlteradaSucessoAtracaoTuristica(receptor.getIdioma()));
            this.ui.escreveLinha(GestorIdiomas.getLabelpaxAlteradaSucessoAtracaoTuristica(receptor.getIdioma()));
        } else {
            this.ui.escreveLinha(GestorIdiomas.getLabelAtracaoTuristicaNaoExiste(receptor.getIdioma(), this.id.getValor()));
        }

    }
    
}