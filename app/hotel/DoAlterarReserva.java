package app.hotel;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.Constantes;
import ui.LerString;
import ui.LerInteiro;
import ui.exceptions.DialogException;

public class DoAlterarReserva extends Comando<Agencia> {

    private LerInteiro id;
    private LerString checkinHotel;
    private LerString horacheckinHotel;
    private LerString checkoutHotel;
    private LerString horacheckoutHotel;
    private LerString camasHotel;
    private LerString quartosHotel;
    private LerString paxHotel;

    public DoAlterarReserva(Agencia receptor, String titulo) {
        super(receptor, titulo);

        this.id = new LerInteiro(GestorIdiomas.getLabelpedirIDHotel(receptor.getIdioma()));
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
        this.ui.lerInput(this.id);
        if (this.getReceptor().HotelExiste(this.id.getValor())) {
            
            this.ui.lerInput(this.checkinHotel);
            this.ui.lerInput(this.horacheckinHotel);
            this.ui.lerInput(this.checkoutHotel);
            this.ui.lerInput(this.horacheckoutHotel);
            this.ui.lerInput(this.camasHotel);
            this.ui.lerInput(this.quartosHotel);
            this.ui.lerInput(this.paxHotel);
            this.getReceptor().alteranomeHotel(this.id.getValor(), this.checkinHotel.getValor(), this.horacheckinHotel.getValor(), this.checkoutHotel.getValor(), 
            this.horacheckoutHotel.getValor(), this.camasHotel.getValor(), this.quartosHotel.getValor(), this.paxHotel.getValor());
            this.ui.escreveLinha(GestorIdiomas.getLabeldataCheckinAlteradaSucessoHotel(receptor.getIdioma()));
            this.ui.escreveLinha(GestorIdiomas.getLabelhoraCheckinAlteradaSucessoHotel(receptor.getIdioma()));
            this.ui.escreveLinha(GestorIdiomas.getLabeldataCheckoutAlteradaSucessoHotel(receptor.getIdioma()));
            this.ui.escreveLinha(GestorIdiomas.getLabelhoraCheckoutAlteradaSucessoHotel(receptor.getIdioma()));
            this.ui.escreveLinha(GestorIdiomas.getLabelcamasAlteradaSucessoHotel(receptor.getIdioma()));
            this.ui.escreveLinha(GestorIdiomas.getLabelquartosAlteradaSucessoHotel(receptor.getIdioma()));
            this.ui.escreveLinha(GestorIdiomas.getLabelpaxAlteradaSucessoHotel(receptor.getIdioma()));
        } else {
            this.ui.escreveLinha(GestorIdiomas.getLabelHotelNaoExiste(receptor.getIdioma(), this.id.getValor()));
        }


    }
    
}