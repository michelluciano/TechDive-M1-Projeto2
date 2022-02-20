package habilitPro;

public class TrabHist {
    private int idHist;
    private Trabalhador hitTrabalhador;
    private Empresa histEmpresa;
    private Trilha histTrilha;
    private String hitFuncao;
    public static int serialhist = 0;

    public TrabHist() {
    }

    public TrabHist(int idHist, Trabalhador hitTrabalhador, Empresa histEmpresa, Trilha histTrilha, String hitFuncao) {
        this.idHist = idHist;
        this.hitTrabalhador = hitTrabalhador;
        this.histEmpresa = histEmpresa;
        this.histTrilha = histTrilha;
        this.hitFuncao = hitFuncao;
    }

    public int getIdHist() {
        return idHist;
    }

    public void setIdHist(int idHist) {
        this.idHist = idHist;
    }

    public Trabalhador getHitTrabalhador() {
        return hitTrabalhador;
    }

    public void setHitTrabalhador(Trabalhador hitTrabalhador) {
        this.hitTrabalhador = hitTrabalhador;
    }

    public Empresa getHistEmpresa() {
        return histEmpresa;
    }

    public void setHistEmpresa(Empresa histEmpresa) {
        this.histEmpresa = histEmpresa;
    }

    public Trilha getHistTrilha() {
        return histTrilha;
    }

    public void setHistTrilha(Trilha histTrilha) {
        this.histTrilha = histTrilha;
    }

    public String getHitFuncao() {
        return hitFuncao;
    }

    public void setHitFuncao(String hitFuncao) {
        this.hitFuncao = hitFuncao;
    }
}
