package agencia;

public class AtracaoTuristica {
    private int id;
    private String nomeAtracaoTuristica;
    private String localAtracaoTuristica;
    private String dataAtracaoTuristica;
    private String horaAtracaoTuristica;
    private String paxAtracaoTuristica;

    public AtracaoTuristica(int id, String nomeAtracaoTuristica, String localAtracaoTuristica, String dataAtracaoTuristica, String horaAtracaoTuristica, String paxAtracaoTuristica) {
        this.id = id;
        this.nomeAtracaoTuristica = nomeAtracaoTuristica;
        this.localAtracaoTuristica = localAtracaoTuristica;
        this.dataAtracaoTuristica = dataAtracaoTuristica;
        this.horaAtracaoTuristica = horaAtracaoTuristica;
        this.paxAtracaoTuristica = paxAtracaoTuristica;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAtracaoTuristica() {
        return this.nomeAtracaoTuristica;
    }

    public void setNomeAtracaoTuristica(String nomeAtracaoTuristica) {
        this.nomeAtracaoTuristica = nomeAtracaoTuristica;
    }

    public String getLocalAtracaoTuristica() {
        return this.localAtracaoTuristica;
    }

    public void setLocalAtracaoTuristica(String localAtracaoTuristica) {
        this.localAtracaoTuristica = localAtracaoTuristica;
    }

    public String getDataAtracaoTuristica() {
        return this.dataAtracaoTuristica;
    }

    public void setDataAtracaoTuristica(String dataAtracaoTuristica) {
        this.dataAtracaoTuristica = dataAtracaoTuristica;
    }

    public String getHoraAtracaoTuristica() {
        return this.horaAtracaoTuristica;
    }

    public void setHoraAtracaoTuristica(String horaAtracaoTuristica) {
        this.horaAtracaoTuristica = horaAtracaoTuristica;
    }

    public String getPaxAtracaoTuristica() {
        return this.paxAtracaoTuristica;
    }

    public void setPaxAtracaoTuristica(String paxAtracaoTuristica) {
        this.paxAtracaoTuristica = paxAtracaoTuristica;
    }

    @Override
    public String toString() {
        return "[" + this.id + "] " + this.nomeAtracaoTuristica + " , " + this.localAtracaoTuristica + " , " + this.dataAtracaoTuristica + " , " + this.horaAtracaoTuristica + " , " + this.paxAtracaoTuristica;
    }

}
