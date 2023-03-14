package app.hotel;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.Constantes;
import ui.LerString;
import ui.exceptions.DialogException;

public class DoFazerReserva extends Comando<Agencia> {

    private LerString nomeHotel;
    private LerString localHotel;
    private LerString checkinHotel;
    private LerString horacheckinHotel;
    private LerString checkoutHotel;
    private LerString horacheckoutHotel;
    private LerString camasHotel;
    private LerString quartosHotel;
    private LerString paxHotel;

    public DoFazerReserva(Agencia receptor, String titulo) {
        super(receptor, titulo);

        this.nomeHotel=new LerString(GestorIdiomas.getLabelpedirNomeHotel(receptor.getIdioma()), null);
        this.localHotel=new LerString(GestorIdiomas.getLabelpedirLocalHotel(receptor.getIdioma()), null);
        this.checkinHotel=new LerString(GestorIdiomas.getLabelpedirDataCheckinHotel(receptor.getIdioma()), Constantes.DATE_REGEX);
        this.horacheckinHotel=new LerString(GestorIdiomas.getLabelpedirHoraCheckinHotel(receptor.getIdioma()), Constantes.TIME_REGEX);
        this.checkoutHotel=new LerString(GestorIdiomas.getLabelpedirDataCheckoutHotel(receptor.getIdioma()), Constantes.DATE_REGEX);
        this.horacheckoutHotel=new LerString(GestorIdiomas.getLabelpedirHoraCheckoutHotel(receptor.getIdioma()), Constantes.TIME_REGEX);
        this.camasHotel=new LerString(GestorIdiomas.getLabelpedirCamasHotel(receptor.getIdioma()), null);
        this.quartosHotel=new LerString(GestorIdiomas.getLabelpedirQuartosHotel(receptor.getIdioma()), null);
        this.paxHotel=new LerString(GestorIdiomas.getLabelpedirPaxHotel(receptor.getIdioma()), null);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        this.ui.lerInput(this.nomeHotel);
        this.ui.lerInput(this.localHotel);
        this.ui.lerInput(this.checkinHotel);
        this.ui.lerInput(this.horacheckinHotel);
        this.ui.lerInput(this.checkoutHotel);
        this.ui.lerInput(this.horacheckoutHotel);
        this.ui.lerInput(this.camasHotel);
        this.ui.lerInput(this.quartosHotel);
        this.ui.lerInput(this.paxHotel);

        System.out.println(GestorIdiomas.getLabeldevolveNomeHotel(receptor.getIdioma()) + this.nomeHotel.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveLocalHotel(receptor.getIdioma()) + this.localHotel.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveDataCheckinHotel(receptor.getIdioma()) + this.checkinHotel.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveHoraCheckinHotel(receptor.getIdioma()) + this.horacheckinHotel.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveDataCheckoutHotel(receptor.getIdioma()) + this.checkoutHotel.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveHoraCheckoutHotel(receptor.getIdioma()) + this.horacheckoutHotel.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveCamasHotel(receptor.getIdioma()) + this.camasHotel.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveQuartosHotel(receptor.getIdioma()) + this.quartosHotel.getValor());
        System.out.println(GestorIdiomas.getLabeldevolvePaxHotel(receptor.getIdioma()) + this.paxHotel.getValor());

        boolean result = this.getReceptor().criarHotel(nomeHotel.getValor(), localHotel.getValor(), checkinHotel.getValor(), 
        this.horacheckinHotel.getValor(), this.checkoutHotel.getValor(), this.horacheckoutHotel.getValor(), this.camasHotel.getValor(),
        this.quartosHotel.getValor(), this.paxHotel.getValor());
        if(result){
            this.ui.escreveLinha(GestorIdiomas.getLabelMsgSucessoHotel(receptor.getIdioma()));
        }
        else
        this.ui.escreveLinha(GestorIdiomas.getLabelMsgErroHotel(receptor.getIdioma()));

    }
    
}