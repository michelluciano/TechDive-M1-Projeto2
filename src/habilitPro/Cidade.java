package habilitPro;

public class Cidade {

    private int idCidade;
    private String descCidade;
    private Estado estado;
    public static int serialCidade =0;

    public Cidade() {
    }

    public Cidade(int idCidade, String descCidade, Estado estado) {
        this.idCidade = idCidade;
        this.descCidade = descCidade;
        this.estado = estado;
    }

    //getter e setter

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
}
