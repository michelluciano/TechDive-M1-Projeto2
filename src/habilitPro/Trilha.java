package habilitPro;

import java.util.ArrayList;
import java.util.List;

public class Trilha {

    private int idTrilha;
    private Empresa nomneEmpresa;
    private String ocupacao;
    private String nome;
    private String apelido;
    private List<Modulo> modulos;
    private String satisfacao;
    private String anotacoes;

    public Trilha(int idTrilha, Empresa nomneEmpresa, String ocupacao, String nome, String apelido, List<Modulo> modulos, String satisfacao, String anotacoes) {
        this.idTrilha = idTrilha;
        this.nomneEmpresa = nomneEmpresa;
        this.ocupacao = ocupacao;
        this.nome = nome;
        this.apelido = apelido;
        this.modulos = modulos;
        this.satisfacao = satisfacao;
        this.anotacoes = anotacoes;
    }

    public int getIdTrilha() {
        return idTrilha;
    }

    public void setIdTrilha(int idTrilha) {
        this.idTrilha = idTrilha;
    }

    public Empresa getEmpresa() {
        return nomneEmpresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.nomneEmpresa = empresa;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public String getSatisfacao() {
        return satisfacao;
    }

    public void setSatisfacao(String satisfacao) {
        this.satisfacao = satisfacao;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    @Override
    public String toString() {
        return "Ttrilha{" +
                "idTrilha=" + idTrilha +
                ", empresa=" + nomneEmpresa +
                ", ocupacao='" + ocupacao + '\'' +
                ", nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", modulos=" + modulos +
                ", satisfacao='" + satisfacao + '\'' +
                ", anotacoes='" + anotacoes + '\'' +
                '}';
    }
}
