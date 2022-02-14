package habilitPro;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int idUsuario;
    private String nome;
    private String CPF;
    private String email;
    private String senha;
    private Perfil perfil;
    public static int serialUsuario =0;


    public Usuario(int idUsuario, String nome, String CPF, String email, String senha, Perfil perfil) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    public ArrayList<Perfil> getPerfis(ArrayList<Perfil> perfis){
        ArrayList<Perfil> perfisTemp = new ArrayList<>();

        for (int i = 0; i< perfis.size(); i++){
            Perfil perfil = perfis.get(i);
            if (perfil.getUsuario().equals(this)){
                perfisTemp.add(perfil);
            }
        }
        return perfisTemp;
    } // fim array

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", perfil=" + perfil +
                '}';
    }
}
