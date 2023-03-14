package app.main;

import java.util.ArrayList;

import agencia.Cliente;
import agencia.Agencia;
import agencia.Idiomas;
import app.idiomas.GestorIdiomas;
import ui.Comando;
import ui.exceptions.DialogException;

public class DoListarClientes extends Comando<Agencia> {

    public DoListarClientes(Agencia receptor, String titulo) {
        super(receptor, titulo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("\033[H\033[2J");
        ArrayList<Cliente> todos=this.getReceptor().listarClientes();
        this.ui.escreveLinha(GestorIdiomas.getLabelListarClientes(receptor.getIdioma()));
        for (Cliente agencia : todos) {
            this.ui.escreveLinha(agencia.toString());
        }
        
    }
    
}
