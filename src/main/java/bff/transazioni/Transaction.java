package bff.transazioni;

public class Transaction {

    private String nazione; 
    private String numeroOrdine;
    private String tipoWF; 
    private String tipoTransazione;
    private Double rinuncia;
    private Double sconto;
    private Integer mesiRate;
    private Integer altro;


    public Transaction(String nazione, String numeroOrdine, String tipoWF, String tipoTransazione, Double rinuncia, Double sconto, Integer mesiRate, Integer altro) {
        this.nazione = nazione;
        this.numeroOrdine = numeroOrdine;
        this.tipoWF = tipoWF;
        this.tipoTransazione = tipoTransazione;
        this.rinuncia = rinuncia;
        this.sconto = sconto;
        this.mesiRate = mesiRate;
        this.altro = altro;
    }

    public Transaction() {}

    public String getNazione() {
        return this.nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String getNumeroOrdine() {
        return this.numeroOrdine;
    }

    public void setNumeroOrdine(String numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public String getTipoWF() {
        return this.tipoWF;
    }

    public void setTipoWF(String tipoWF) {
        this.tipoWF = tipoWF;
    }

    public String getTipoTransazione() {
        return this.tipoTransazione;
    }

    public void setTipoTransazione(String tipoTransazione) {
        this.tipoTransazione = tipoTransazione;
    }

    public Double getRinuncia() {
        return this.rinuncia;
    }

    public void setRinuncia(Double rinuncia) {
        this.rinuncia = rinuncia;
    }

    public Double getSconto() {
        return this.sconto;
    }

    public void setSconto(Double sconto) {
        this.sconto = sconto;
    }

    public Integer getMesiRate() {
        return this.mesiRate;
    }

    public void setMesiRate(Integer mesiRate) {
        this.mesiRate = mesiRate;
    }

    public Integer getAltro() {
        return this.altro;
    }

    public void setAltro(Integer altro) {
        this.altro = altro;
    }




    @Override
    public String toString() {
        return "{" +
            " nazione='" + getNazione() + "'" +
            ", numeroOrdine='" + getNumeroOrdine() + "'" +
            ", tipoWF='" + getTipoWF() + "'" +
            ", tipoTransazione='" + getTipoTransazione() + "'" +
            ", rinuncia='" + getRinuncia() + "'" +
            ", sconto='" + getSconto() + "'" +
            ", mesiRate='" + getMesiRate() + "'" +
            ", altro='" + getAltro() + "'" +
            "}";
    }
    

}