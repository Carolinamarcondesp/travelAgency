package app;

import agencia.Agencia;
import app.main.Menu;


public class App {

    public static void main(String[] args) {
        
        Agencia agencia = new Agencia("Atec Travel Management");
 
        Menu m = new Menu(agencia);
        m.open();
    }    
}
