package habilitPro;

import java.util.ArrayList;

public class RegionalSenai {

    private int idRegionalSenai;
    private String descRegionalSenai;
    private ArrayList<Cidade> cidadeRegionalSenai;

    public RegionalSenai() {
    }

    public RegionalSenai(int idRegionalSenai, String descRegionalSenai, ArrayList<Cidade> cidadeRegionalSenai) {
        this.idRegionalSenai = idRegionalSenai;
        this.descRegionalSenai = descRegionalSenai;
        this.cidadeRegionalSenai = cidadeRegionalSenai;
    }

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

    public ArrayList<Cidade> getCidadeRegionalSenai() {
        return cidadeRegionalSenai;
    }

    public void setCidadeRegionalSenai(ArrayList<Cidade> cidadeRegionalSenai) {
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
