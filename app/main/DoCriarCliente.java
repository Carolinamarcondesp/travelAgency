package app.main;

import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.Constantes;
import ui.LerString;
import ui.exceptions.DialogException;

public class DoCriarCliente extends Comando<Agencia> {

    private LerString nome;
    private LerString email;
    private LerString NIF;

    

    public DoCriarCliente(Agencia receptor, String titulo) {
        super(receptor, titulo);
        
        nome = new LerString(GestorIdiomas.getLabelpedirNomeCliente(receptor.getIdioma()), null);
        email = new LerString(GestorIdiomas.getLabelpedirEmailCliente(receptor.getIdioma()), Constantes.EMAIL_REGEX);
        NIF = new LerString(GestorIdiomas.getLabelpedirNIFCliente(receptor.getIdioma()), Constantes.NIF_REGEX);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        this.ui.lerInput(this.nome);
        this.ui.lerInput(this.email);
        this.ui.lerInput(this.NIF);

        System.out.println(GestorIdiomas.getLabeldevolveNomeCliente(receptor.getIdioma()) + this.nome.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveEmailCliente(receptor.getIdioma()) + this.email.getValor());
        System.out.println(GestorIdiomas.getLabeldevolveNIFCliente(receptor.getIdioma()) + this.NIF.getValor());

        boolean result = this.getReceptor().criarCliente(nome.getValor(), email.getValor(), NIF.getValor());
        if(result){
            this.ui.escreveLinha(GestorIdiomas.getLabelMsgSucessoCliente(receptor.getIdioma()));
        }
        else
        this.ui.escreveLinha(GestorIdiomas.getLabelMsgErroCliente(receptor.getIdioma()));
    }

}
