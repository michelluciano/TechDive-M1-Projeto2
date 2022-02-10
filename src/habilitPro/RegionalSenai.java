package habilitPro;

public class RegionalSenai {

    private int idRegionalSenai;
    private String descRegionalSenai;
    private Cidade cidadeRegionalSenai;

    public RegionalSenai() {
    }

    public RegionalSenai(int idRegionalSenai, String descRegionalSenai, Cidade cidadeRegionalSenai) {
        this.idRegionalSenai = idRegionalSenai;
        this.descRegionalSenai = descRegionalSenai;
        this.cidadeRegionalSenai = cidadeRegionalSenai;
    }

    // getter e setter

    public int getIdRegionalSenai() {
        return idRegionalSenai;
    }

    public void setIdRegionalSenai(int idRegionalSenai) {
        this.idRegionalSenai = idRegionalSenai;
    }

    public String getDescRegionalSenai() {
        return descRegionalSenai;
    }

    public void setDescRegionalSenai(String descRegionalSenai) {
        this.descRegionalSenai = descRegionalSenai;
    }

    public Cidade getCidadeRegionalSenai() {
        return cidadeRegionalSenai;
    }

    public void setCidadeRegionalSenai(Cidade cidadeRegionalSenai) {
        this.cidadeRegionalSenai = cidadeRegionalSenai;
    }

    @Override
    public String toString() {
        return "RegionalSenai{" +
                "idRegionalSenai=" + idRegionalSenai +
                ", descRegionalSenai='" + descRegionalSenai + '\'' +
                ", cidadeRegionalSenai=" + cidadeRegionalSenai +
                '}';
    }
}
