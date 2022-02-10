package habilitPro;

public class Cidade {

    private int idCidade;
    private String descCidade;
    private Estado estado;

    public Cidade(int idCidade, String descCidade, Estado estado) {
        this.idCidade = idCidade;
        this.descCidade = descCidade;
        this.estado = estado;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getDescCidade() {
        return descCidade;
    }

    public void setDescCidade(String descCidade) {
        this.descCidade = descCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "idCidade=" + idCidade +
                ", descCidade='" + descCidade + '\'' +
                ", estado=" + estado +
                '}';
    }
}
