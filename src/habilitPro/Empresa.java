package habilitPro;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
//TODO: [RF01] = ok
    private int idEmpresa;
    private String nomeEmpresa;
    private String CNPJEmpresa;
    private String tipoEmpresa;
    private String nomeFilial;
    private SegmentoEmpresa segmentoEmpresa;
    private Cidade cidadeEmpresa;
    private RegionalSenai regionalSenai;
    private ArrayList<Trilha> trilhaEmp = new ArrayList<>(); // trilhas associdas a esta conta
    public static int serialEmpresa;

    public Empresa() {
    }

    //construtor com FILIAL
    public Empresa(int idEmpresa, String nomeEmpresa, String CNPJEmpresa, String tipoEmpresa, String nomeFilial, SegmentoEmpresa segmentoEmpresa, Cidade cidadeEmpresa, RegionalSenai regionalSenai) {
        this.idEmpresa = idEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.CNPJEmpresa = CNPJEmpresa;
        this.tipoEmpresa = tipoEmpresa;
        this.nomeFilial = nomeFilial;
        this.segmentoEmpresa = segmentoEmpresa;
        this.cidadeEmpresa = cidadeEmpresa;
        this.regionalSenai = regionalSenai;

    }

    //CONSTRUTOR COM MATRIZ
    public Empresa(int idEmpresa, String nomeEmpresa, String CNPJEmpresa, String tipoEmpresa, SegmentoEmpresa segmentoEmpresa, Cidade cidadeEmpresa, RegionalSenai regionalSenai) {
        this.idEmpresa = idEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.CNPJEmpresa = CNPJEmpresa;
        this.tipoEmpresa = tipoEmpresa;
        this.segmentoEmpresa = segmentoEmpresa;
        this.cidadeEmpresa = cidadeEmpresa;
        this.regionalSenai = regionalSenai;
    }

    public ArrayList<Trilha> getTrilhaEmp() {
        return trilhaEmp;
    }

    public void setTrilhaEmp(ArrayList<Trilha> trilhaEmp) {
        this.trilhaEmp = trilhaEmp;
    }

    public int getIdEmpresa() {return idEmpresa;}

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCNPJEmpresa() {
        return CNPJEmpresa;
    }

    public void setCNPJEmpresa(String CNPJEmpresa) {
        this.CNPJEmpresa = CNPJEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public SegmentoEmpresa getSegmentoEmpresa() {
        return segmentoEmpresa;
    }

    public void setSegmentoEmpresa(SegmentoEmpresa segmentoEmpresa) {
        this.segmentoEmpresa = segmentoEmpresa;
    }

    public Cidade getCidadeEmpresa() {
        return cidadeEmpresa;
    }

    public void setCidadeEmpresa(Cidade cidadeEmpresa) {
        this.cidadeEmpresa = cidadeEmpresa;
    }

    public RegionalSenai getRegionalSenai() {
        return regionalSenai;
    }

    public void setRegionalSenai(RegionalSenai regionalSenai) {
        this.regionalSenai = regionalSenai;
    }

}
