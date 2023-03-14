package agencia;

import java.util.ArrayList;
import java.util.HashMap;

public class Agencia {

    // Idioma
    
    private Idiomas idioma;

    public Idiomas getIdioma() {
        return this.idioma;
    }

    public void setIdioma(Idiomas idioma) {
        this.idioma = idioma;
    }

    // Cliente

    public String nome;
    public HashMap<String, Cliente> dossierClientes;
    public HashMap<Integer, Cliente> ClientesID;
    private int nextCliente;

    // Atração Turística

    private HashMap<String, AtracaoTuristica> dossierAtracaoTuristica;
    public HashMap<Integer, AtracaoTuristica> AtracaoTuristicaID;
    private int nextAtracaoTuristica = 1;

    // Hotel

    private HashMap<String, Hotel> dossierHotel;
    public HashMap<Integer, Hotel> HotelID;
    private int nextHotel = 1;

    // Restaurante 

    private HashMap<String, Restaurante> dossierRestaurante;
    public HashMap<Integer, Restaurante> RestauranteID;
    private int nextRestaurante = 1;
   

    // Todos

    public Agencia(String _nome) {
        this.idioma=Idiomas.PT;

        this.nome = _nome;
        this.dossierClientes = new HashMap<>();
        this.ClientesID = new HashMap<>();
        this.nextCliente = 1;

        this.dossierAtracaoTuristica = new HashMap<>();
        this.AtracaoTuristicaID = new HashMap<>();
        this.nextAtracaoTuristica = 1;

        this.dossierHotel = new HashMap<>();
        this.HotelID = new HashMap<>();
        this.nextHotel = 1;

        this.dossierRestaurante = new HashMap<>();
        this.RestauranteID = new HashMap<>();
        this.nextRestaurante = 1;
    }

    //Idioma

    public boolean escolherIdiomaENG(){
        this.idioma=Idiomas.ENG;
        return true;
    }

    public boolean escolherIdiomaPT(){
        this.idioma=Idiomas.PT;
        return true;
    }

    public boolean trocarIdioma(){
        switch(this.idioma){
            case PT:
                return this.escolherIdiomaENG();
            case ENG:
                return this.escolherIdiomaPT();
            default:
                return false;
        }
        
    }

    // Cliente

    public boolean criarCliente(String nome, String email, String NIF) {
        if (this.dossierClientes.containsKey(NIF))
            return false;
        Cliente c = new Cliente(this.nextCliente, nome, email, NIF);
        this.dossierClientes.put(NIF, c);
        this.ClientesID.put(c.getId(), c);
        this.nextCliente++;
        return true;
    }

    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> todos = new ArrayList<>(this.ClientesID.values());
        return todos;
    }

    // Atração Turística

    /**
     * @param id
     * @param nomeAtracaoTuristica
     * @param localAtracaoTuristica
     * @param dataAtracaoTuristica
     * @param horaAtracaoTuristica
     * @param paxAtracaoTuristica
     */

    public boolean criarAtracaoTuristica(String nomeAtracaoTuristica, String localAtracaoTuristica,
            String dataAtracaoTuristica, String horaAtracaoTuristica, String paxAtracaoTuristica) {
        if (this.dossierAtracaoTuristica.containsKey(nomeAtracaoTuristica))
            return false;
        AtracaoTuristica a = new AtracaoTuristica(this.nextAtracaoTuristica, nomeAtracaoTuristica,
                localAtracaoTuristica, dataAtracaoTuristica, horaAtracaoTuristica, paxAtracaoTuristica);
        this.dossierAtracaoTuristica.put(nomeAtracaoTuristica, a);
        this.AtracaoTuristicaID.put(a.getId(), a);
        this.nextAtracaoTuristica++;
        return true;
    }

    /**
     * 
     * @return
     */

    public ArrayList<AtracaoTuristica> listarAtracaoTuristica() {
        ArrayList<AtracaoTuristica> todosAtracaoTuristica = new ArrayList<>(this.AtracaoTuristicaID.values());
        return todosAtracaoTuristica;
    }

    public boolean apagaAtracaoTuristica(int id) {
        if (this.AtracaoTuristicaID.containsKey(id)) {
            this.AtracaoTuristicaID.remove(id);
            return true;
        }
        return false;
    }

    /**
     * 
     * @param id
     * @return true/false
     */
    public boolean AtracaoTuristicaExiste(int id) {
        return this.AtracaoTuristicaID.containsKey(id);
    }

    public void alteraNomeAtracaoTuristica(int id, String dataAtracaoTuristica, String horaAtracaoTuristica,
            String paxAtracaoTuristica) {
        this.AtracaoTuristicaID.get(id).setDataAtracaoTuristica(dataAtracaoTuristica);
        this.AtracaoTuristicaID.get(id).setHoraAtracaoTuristica(horaAtracaoTuristica);
        this.AtracaoTuristicaID.get(id).setPaxAtracaoTuristica(paxAtracaoTuristica);
    }

    // Hotel

    /**
     * @param id
     * @param nomeHotel
     * @param localHotel
     * @param checkinHotel
     * @param horacheckinHotel
     * @param checkoutHotel
     * @param horacheckoutHotel
     * @param camasHotel
     * @param quartosHotel
     * @param paxHotel
     */

    public boolean criarHotel(String nomeHotel, String localHotel, String checkinHotel, String horacheckinHotel,
            String checkoutHotel, String horacheckoutHotel, String camasHotel, String quartosHotel, String paxHotel) {
        if (this.dossierHotel.containsKey(nomeHotel))
            return false;
        Hotel h = new Hotel(this.nextHotel, nomeHotel,
                localHotel, checkinHotel, horacheckinHotel, checkoutHotel, horacheckoutHotel, camasHotel, quartosHotel,
                paxHotel);
        this.dossierHotel.put(nomeHotel, h);
        this.HotelID.put(h.getId(), h);
        this.nextHotel++;
        return true;
    }

    /**
     * 
     * @return
     */

    public ArrayList<Hotel> listarHotel() {
        ArrayList<Hotel> todosHotel = new ArrayList<>(this.HotelID.values());
        return todosHotel;
    }

    public boolean apagaHotel(int id) {
        if (this.HotelID.containsKey(id)) {
            this.HotelID.remove(id);
            return true;
        }
        return false;
    }

    /**
     * 
     * @param id
     * @return true/false
     */
    public boolean HotelExiste(int id) {
        return this.HotelID.containsKey(id);
    }

    public void alteranomeHotel(int id, String checkinHotel, String horacheckinHotel, String checkoutHotel,
            String horacheckoutHotel, String camasHotel, String quartosHotel, String paxHotel) {
        this.HotelID.get(id).setCheckinHotel(checkinHotel);
        this.HotelID.get(id).setHoracheckinHotel(horacheckinHotel);
        this.HotelID.get(id).setCheckoutHotel(checkoutHotel);
        this.HotelID.get(id).setHoracheckoutHotel(horacheckoutHotel);
        this.HotelID.get(id).setCamasHotel(camasHotel);
        this.HotelID.get(id).setQuartosHotel(quartosHotel);
        this.HotelID.get(id).setPaxHotel(paxHotel);
    }

    // Restaurante

    /**
     * @param id
     * @param nomeRestaurante
     * @param localRestaurante
     * @param dataRestaurante
     * @param horaRestaurante
     * @param paxRestaurante
     */

    public boolean criarRestaurante(String nomeRestaurante, String localRestaurante,
            String dataRestaurante, String horaRestaurante, String paxRestaurante) {
        if (this.dossierRestaurante.containsKey(nomeRestaurante))
            return false;
            Restaurante r = new Restaurante(this.nextRestaurante, nomeRestaurante,
                localRestaurante, dataRestaurante, horaRestaurante, paxRestaurante);
        this.dossierRestaurante.put(nomeRestaurante, r);
        this.RestauranteID.put(r.getId(), r);
        this.nextRestaurante++;
        return true;
    }

    /**
     * 
     * @return
     */

    public ArrayList<Restaurante> listarRestaurante() {
        ArrayList<Restaurante> todosRestaurante = new ArrayList<>(this.RestauranteID.values());
        return todosRestaurante;
    }

    public boolean apagaRestaurante(int id) {
        if (this.RestauranteID.containsKey(id)) {
            this.RestauranteID.remove(id);
            return true;
        }
        return false;
    }

    /**
     * 
     * @param id
     * @return true/false
     */
    public boolean RestauranteExiste(int id) {
        return this.RestauranteID.containsKey(id);
    }

    public void alteraNomeRestaurante(int id, String dataRestaurante, String horaRestaurante,
            String paxRestaurante) {
        this.RestauranteID.get(id).setDataRestaurante(dataRestaurante);
        this.RestauranteID.get(id).setHoraRestaurante(horaRestaurante);
        this.RestauranteID.get(id).setPaxRestaurante(paxRestaurante);
    }



}
