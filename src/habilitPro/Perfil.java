package habilitPro;

import java.util.ArrayList;

public class Perfil {

    private int idPerfil;
    private String nomePerfil;
    private String descricaoPerfil;
    private Usuario usuario;
    public static int serialPerfil =0;


    public Perfil(int idPerfil, String nomePerfil, String descricaoPerfil) {
        this.idPerfil = idPerfil;
        this.nomePerfil = nomePerfil;
        this.descricaoPerfil = descricaoPerfil;
    }

    public ArrayList<Usuario> getUsuarios(ArrayList<Usuario> usuarios){
        ArrayList<Usuario> usuariosTemp = new ArrayList<>();

        for (int i = 0; i< usuarios.size(); i++){
            Usuario usuario = usuarios.get(i);
            if (usuario.getPerfil().equals(this)){
                usuariosTemp.add(usuario);
            }
        }
        return usuariosTemp;
    } // fim array

    public Usuario getUsuario() { return usuario;}

    public void setUsuario(Usuario usuario) {this.usuario = usuario;}

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
                ", usuario=" + usuario +
                '}';
    }
}
