package habilitPro;

public class Perfil {

    private int idPerfil;
    private String nomePerfil;
    private String descricaoPerfil;

    public Perfil(int idPerfil, String nomePerfil, String descricaoPerfil) {
        this.idPerfil = idPerfil;
        this.nomePerfil = nomePerfil;
        this.descricaoPerfil = descricaoPerfil;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }

    public void setDescricaoPerfil(String descricaoPerfil) {
        this.descricaoPerfil = descricaoPerfil;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "idPerfil=" + idPerfil +
                ", nomePerfil='" + nomePerfil + '\'' +
                ", descricaoPerfil='" + descricaoPerfil + '\'' +
                '}';
    }
}
