package habilitPro;

import java.util.ArrayList;
import java.util.List;

public class RegionalSenai {

    private int idRegionalSenai;
    private String descRegionalSenai;
    public static int serialRegional =0;


    public RegionalSenai() {
    }

    public RegionalSenai(int idRegionalSenai, String descRegionalSenai) {
        this.idRegionalSenai = idRegionalSenai;
        this.descRegionalSenai = descRegionalSenai;

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


}
