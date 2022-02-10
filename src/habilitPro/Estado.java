package habilitPro;

import java.util.ArrayList;

public class Estado {
    private int idEstado;
    private String descEstado;
    private ArrayList<Cidade> cidade;

    public Estado(int idEstado, String descEstado, ArrayList<Cidade> cidade) {
        this.idEstado = idEstado;
        this.descEstado = descEstado;
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

    public ArrayList<Cidade> getCidade() {
        return cidade;
    }

    public void setCidade(ArrayList<Cidade> cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "idEstado=" + idEstado +
                ", descEstado='" + descEstado + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
