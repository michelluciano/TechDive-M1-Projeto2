package habilitPro;

public class SegmentoEmpresa {

    private int idSegmentoEmpresa;
    private String descricaoSegmento;

    public SegmentoEmpresa(int idSegmentoEmpresa, String descricaoSegmento) {
        this.idSegmentoEmpresa = idSegmentoEmpresa;
        this.descricaoSegmento = descricaoSegmento;
    }

    public int getIdSegmentoEmpresa() {
        return idSegmentoEmpresa;
    }

    public void setIdSegmentoEmpresa(int idSegmentoEmpresa) {
        this.idSegmentoEmpresa = idSegmentoEmpresa;
    }

    public String getDescricaoSegmento() {
        return descricaoSegmento;
    }

    public void setDescricaoSegmento(String descricaoSegmento) {
        this.descricaoSegmento = descricaoSegmento;
    }

    @Override
    public String toString() {
        return "SegmentoEmpresa{" +
                "idSegmentoEmpresa=" + idSegmentoEmpresa +
                ", descricaoSegmento='" + descricaoSegmento + '\'' +
                '}';
    }
}
