package habilitPro;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private int idEmpresa;
    private String nomeEmpresa;
    private String CNPJEmpresa;
    private String tipoEmpresa;
    private SegmentoEmpresa segmentoEmpresa;
    private Cidade cidadeEmpresa;
    private RegionalSenai regionalSenai;
    private List<Trilha> trilha;

    public Empresa(int idEmpresa, String nomeEmpresa, String cnpjEmpresa, String tipoEmpresa, SegmentoEmpresa segmentoEmpresa, Cidade cidadeEmpresa, RegionalSenai regionalSenai, List<Trilha> trilha) {
        this.idEmpresa = idEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        CNPJEmpresa = cnpjEmpresa;
        this.tipoEmpresa = tipoEmpresa;
        this.segmentoEmpresa = segmentoEmpresa;
        this.cidadeEmpresa = cidadeEmpresa;
        this.regionalSenai = regionalSenai;
        this.trilha = trilha;
    }
}
