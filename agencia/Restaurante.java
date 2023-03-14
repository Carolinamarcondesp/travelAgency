package agencia;

public class Restaurante {
    private int id;
    private String nomeRestaurante;
    private String localRestaurante;
    private String dataRestaurante;
    private String horaRestaurante;
    private String paxRestaurante;


    public Restaurante() {
    }

    public Restaurante(int id, String nomeRestaurante, String localRestaurante, String dataRestaurante, String horaRestaurante, String paxRestaurante) {
        this.id = id;
        this.nomeRestaurante = nomeRestaurante;
        this.localRestaurante = localRestaurante;
        this.dataRestaurante = dataRestaurante;
        this.horaRestaurante = horaRestaurante;
        this.paxRestaurante = paxRestaurante;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeRestaurante() {
        return this.nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getLocalRestaurante() {
        return this.localRestaurante;
    }

    public void setLocalRestaurante(String localRestaurante) {
        this.localRestaurante = localRestaurante;
    }

    public String getDataRestaurante() {
        return this.dataRestaurante;
    }

    public void setDataRestaurante(String dataRestaurante) {
        this.dataRestaurante = dataRestaurante;
    }

    public String getHoraRestaurante() {
        return this.horaRestaurante;
    }

    public void setHoraRestaurante(String horaRestaurante) {
        this.horaRestaurante = horaRestaurante;
    }

    public String getPaxRestaurante() {
        return this.paxRestaurante;
    }

    public void setPaxRestaurante(String paxRestaurante) {
        this.paxRestaurante = paxRestaurante;
    }

    @Override
    public String toString() {
        return "[" + this.id + "] " + this.nomeRestaurante + " , " + this.localRestaurante + " , " 
        + this.dataRestaurante + " , " + this.horaRestaurante + " , " + this.paxRestaurante;
    }

    
}
