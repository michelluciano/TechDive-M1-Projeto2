package habilitPro;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.List;

public class Estado {
    private int idEstado;
    private String descEstado;
    private String ufEstado;
    public static int serialEstado =0;

    //construtores
    public Estado() {
    }

    public Estado(int idEstado, String descEstado, String ufEstado) {
        this.idEstado = idEstado;
        this.descEstado = descEstado;
        this.ufEstado = ufEstado;
    }

    // lista de cidades

    public ArrayList<Cidade> getCidades(ArrayList<Cidade> cidades){
        ArrayList<Cidade> cidadesTemp = new ArrayList<>();

        for (int i = 0; i< cidades.size(); i++){
            Cidade cidade = cidades.get(i);
            if (cidade.getEstado().equals(this)){
                cidadesTemp.add(cidade);
            }
        }
        return cidadesTemp;
    } // fim array

    //getter e setter


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

    @Override
    public String toString() {
        return "Estado{" +
                "idEstado=" + idEstado +
                ", descEstado='" + descEstado + '\'' +
                ", ufEstado='" + ufEstado + '\'' +
                '}';
    }
}
