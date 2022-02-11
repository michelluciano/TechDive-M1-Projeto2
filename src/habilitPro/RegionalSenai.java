package habilitPro;

import java.util.ArrayList;
import java.util.List;

public class RegionalSenai {

    private int idRegionalSenai;
    private String descRegionalSenai;
    private List<Cidade> cidadeRegionalSenai;

    public RegionalSenai() {
    }

    public RegionalSenai(int idRegionalSenai, String descRegionalSenai, List<Cidade> cidadeRegionalSenai) {
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

    public List<Cidade> getCidadeRegionalSenai() {
        return cidadeRegionalSenai;
    }

    public void setCidadeRegionalSenai(List<Cidade> cidadeRegionalSenai) {
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
