package habilitPro;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    private int idEstado;
    private String descEstado;
    private String ufEstado;
    private List<Cidade> cidade;

    public Estado(int idEstado, String descEstado, String ufEstado, List<Cidade> cidade) {
        this.idEstado = idEstado;
        this.descEstado = descEstado;
        this.ufEstado = ufEstado;
        this.cidade = cidade;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescEstado() {
        return descEstado;
    }

    public void setDescEstado(String descEstado) {
        this.descEstado = descEstado;
    }

    public String getUfEstado() {
        return ufEstado;
    }

    public void setUfEstado(String ufEstado) {
        this.ufEstado = ufEstado;
    }

    public List<Cidade> getCidade() {
        return cidade;
    }

    public void setCidade(List<Cidade> cidade) {
        this.cidade = cidade;
    }
}
