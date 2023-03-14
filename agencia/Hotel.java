package agencia;

public class Hotel {
    private int id;
    private String nomeHotel;
    private String localHotel;
    private String checkinHotel;
    private String horacheckinHotel;
    private String checkoutHotel;
    private String horacheckoutHotel;
    private String camasHotel;
    private String quartosHotel;
    private String paxHotel;

    public Hotel(int id, String nomeHotel, String localHotel, String checkinHotel, String horacheckinHotel, String checkoutHotel, String horacheckoutHotel, String camasHotel, String quartosHotel, String paxHotel) {
        this.id = id;
        this.nomeHotel = nomeHotel;
        this.localHotel = localHotel;
        this.checkinHotel = checkinHotel;
        this.horacheckinHotel = horacheckinHotel;
        this.checkoutHotel = checkoutHotel;
        this.horacheckoutHotel = horacheckoutHotel;
        this.camasHotel = camasHotel;
        this.quartosHotel = quartosHotel;
        this.paxHotel = paxHotel;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeHotel() {
        return this.nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public String getLocalHotel() {
        return this.localHotel;
    }

    public void setLocalHotel(String localHotel) {
        this.localHotel = localHotel;
    }

    public String getCheckinHotel() {
        return this.checkinHotel;
    }

    public void setCheckinHotel(String checkinHotel) {
        this.checkinHotel = checkinHotel;
    }

    public String getHoracheckinHotel() {
        return this.horacheckinHotel;
    }

    public void setHoracheckinHotel(String horacheckinHotel) {
        this.horacheckinHotel = horacheckinHotel;
    }

    public String getCheckoutHotel() {
        return this.checkoutHotel;
    }

    public void setCheckoutHotel(String checkoutHotel) {
        this.checkoutHotel = checkoutHotel;
    }

    public String getHoracheckoutHotel() {
        return this.horacheckoutHotel;
    }

    public void setHoracheckoutHotel(String horacheckoutHotel) {
        this.horacheckoutHotel = horacheckoutHotel;
    }

    public String getCamasHotel() {
        return this.camasHotel;
    }

    public void setCamasHotel(String camasHotel) {
        this.camasHotel = camasHotel;
    }

    public String getQuartosHotel() {
        return this.quartosHotel;
    }

    public void setQuartosHotel(String quartosHotel) {
        this.quartosHotel = quartosHotel;
    }

    public String getPaxHotel() {
        return this.paxHotel;
    }

    public void setPaxHotel(String paxHotel) {
        this.paxHotel = paxHotel;
    }

    @Override
    public String toString() {
        return "[" + this.id + "] " + this.nomeHotel + " , " + this.localHotel + " , " + this.checkinHotel + " , " 
        + this.horacheckinHotel + " , " + this.checkoutHotel + " , " + this.horacheckoutHotel + " , " + this.camasHotel + " , " 
        + this.quartosHotel + " , " + this.paxHotel;
    }

}
