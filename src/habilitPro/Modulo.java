package habilitPro;

import habilitPro.enums.EnumTotal;

import java.time.OffsetDateTime;
import java.util.Date;

public class Modulo {

    private int idModulo;
    private Trilha trilha;
    private String nome;
    private String habilidades;
    private String tarefaValidacao;
    private int prazoLimite = 10; // 10 dias uteis TODO [RN03-03] = ok
    private String status;
    public static int serialModulo = 0;
    private OffsetDateTime dataHoraInicio;
    private OffsetDateTime dataHoraFim;

    public Modulo() {
    }

    public Modulo(int idModulo, Trilha trilha, String nome, String habilidades, String tarefaValidacao, int prazoLimite, String status) {
        this.idModulo = idModulo;
        this.trilha = trilha;
        this.nome = nome;
        this.habilidades = habilidades;
        this.tarefaValidacao = tarefaValidacao;
        this.prazoLimite = prazoLimite;
        this.status = status;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public Trilha getTrilha() { return trilha; }

    public void setTrilha(Trilha trilha) {
        this.trilha = trilha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getTarefaValidacao() {
        return tarefaValidacao;
    }

    public void setTarefaValidacao(String tarefaValidacao) {
        this.tarefaValidacao = tarefaValidacao;
    }

    public int getPrazoLimite() {
        return prazoLimite;
    }

    public void setPrazoLimite(int prazoLimite) {
        this.prazoLimite = prazoLimite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getSerialModulo() {
        return serialModulo;
    }

    public static void setSerialModulo(int serialModulo) {
        Modulo.serialModulo = serialModulo;
    }

    public OffsetDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(OffsetDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public OffsetDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(OffsetDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }
}
