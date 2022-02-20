package habilitPro;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trabalhador {

    private int idTrabalhador;
    private String nome;
    private String CPF;
    private Empresa empresa;
    private String funcao;
    private OffsetDateTime dataFuncao;
    private ArrayList<Trilha> trilhasTrab = new ArrayList<>();
    private ArrayList<Modulo> modulosTrab = new ArrayList<>();
    private ArrayList<TrabHist> historicoTrab = new ArrayList<>();
    public static int serialTrabalhador = 0;

    public Trabalhador() {
    }

    public Trabalhador(int idTrabalhador,Empresa empresa, String nome, String CPF, String funcao) {
        this.idTrabalhador = idTrabalhador;
        this.empresa = empresa;
        this.nome = nome;
        this.CPF = CPF;
        this.funcao = funcao;

    }

    public Empresa getEmpresa() {    return empresa;  }

    public void setEmpresa(Empresa empresa) { this.empresa = empresa; }

    public int getIdTrabalhador() {
        return idTrabalhador;
    }

    public void setIdTrabalhador(int idTrabalhador) {
        this.idTrabalhador = idTrabalhador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public OffsetDateTime getDataFuncao() {
        return dataFuncao;
    }

    public void setDataFuncao(OffsetDateTime dataFuncao) {
        this.dataFuncao = dataFuncao;
    }

    public ArrayList<Trilha> getTrilhasTrab() {
        return trilhasTrab;
    }

    public void setTrilhasTrab(ArrayList<Trilha> trilhasTrab) {
        this.trilhasTrab = trilhasTrab;
    }

    public ArrayList<Modulo> getModulosTrab() {
        return modulosTrab;
    }

    public void setModulosTrab(ArrayList<Modulo> modulosTrab) {
        this.modulosTrab = modulosTrab;
    }

    public ArrayList<TrabHist> getHistoricoTrab() {
        return historicoTrab;
    }

    public void setHistoricoTrab(ArrayList<TrabHist> historicoTrab) {
        this.historicoTrab = historicoTrab;
    }
}
