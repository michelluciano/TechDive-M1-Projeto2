package habilitPro;

import java.util.ArrayList;

public class Trilha {

    private int idTrilha;
    private Empresa nomeEmpresa;
    private String ocupacao;
    private String nome;
    private String apelido;
    private ArrayList<Modulo> modulosTri = new ArrayList<>();
    private int satisfacao;
    private String anotacoes;
    public static int serialTrilha = 0;
    public static int serialOcupacao = 0; // utilizado para criar o nome da trilha

    // construtor trilha com satisfação
    public Trilha(int idTrilha, Empresa nomneEmpresa, String ocupacao, String nome, String apelido, int satisfacao, String anotacoes) {
        this.idTrilha = idTrilha;
        this.nomeEmpresa = nomneEmpresa;
        this.ocupacao = ocupacao;
        this.nome = nome;
        this.apelido = apelido;
        this.satisfacao = satisfacao;
        this.anotacoes = anotacoes;
    }

    // construtor trilha nova
    public Trilha(int idTrilha, Empresa nomeEmpresa, String ocupacao, String nome, String apelido) {
        this.idTrilha = idTrilha;
        this.nomeEmpresa = nomeEmpresa;
        this.ocupacao = ocupacao;
        this.nome = nome;
        this.apelido = apelido;
    }

    public Empresa getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(Empresa nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public ArrayList<Modulo> getModulosTri() {
        return modulosTri;
    }

    public void setModulosTri() {
        this.modulosTri = modulosTri;
    }

    public int getIdTrilha() {
        return idTrilha;
    }

    public void setIdTrilha(int idTrilha) {
        this.idTrilha = idTrilha;
    }

    public Empresa getEmpresa() {
        return nomeEmpresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.nomeEmpresa = empresa;
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

    public int getSatisfacao() {
        return satisfacao;
    }

    public void setSatisfacao(int satisfacao) {
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
        return "Trilha{nome= "+ nome + "-"+ "apelido=" + apelido +'}';
    }
}
