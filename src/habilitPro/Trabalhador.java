package habilitPro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trabalhador {

    private int idTrabalhador;
    private String nome;
    private String CPF;
    private ArrayList<Empresa> empresa = new ArrayList<>();// empresas deste trabalhador
    private String funcao;
    private Date dataFuncao;
    private List<Trilha> trilhas = new ArrayList<>();
    private List<Modulo> modulos = new ArrayList<>();
    public static int serialTrabalhador = 0;

    public Trabalhador() {
    }

    public Trabalhador(int idTrabalhador, String nome, String CPF, String funcao) {
        this.idTrabalhador = idTrabalhador;
        this.nome = nome;
        this.CPF = CPF;
        this.funcao = funcao;

    }

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

    public ArrayList<Empresa> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ArrayList<Empresa> empresa) {
        this.empresa = empresa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Date getDataFuncao() {
        return dataFuncao;
    }

    public void setDataFuncao(Date dataFuncao) {
        this.dataFuncao = dataFuncao;
    }

    public List<Trilha> getTrilhas() {
        return trilhas;
    }

    public void setTrilhas(List<Trilha> trilhas) {
        this.trilhas = trilhas;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }
}
