package guilhermeborgesbastos.com.br.tindercardslide.pojos;

/**
 * Created by guilh on 18/01/2016.
 */
public class Notification {

    private int id;
    private int id_solicitante;
    private int id_solicitado;
    private int status;
    private int type;
    private int atualizado_em;
    private int criado_em;

    private String nome;
    private String sobrenome;
    private String foto;
    private int id_usuario;
    private int nascimento;
    private String nome_cidade;
    private String nome_estado;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_solicitante() {
        return id_solicitante;
    }

    public void setId_solicitante(int id_solicitante) {
        this.id_solicitante = id_solicitante;
    }

    public int getId_solicitado() {
        return id_solicitado;
    }

    public void setId_solicitado(int id_solicitado) {
        this.id_solicitado = id_solicitado;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAtualizado_em() {
        return atualizado_em;
    }

    public void setAtualizado_em(int atualizado_em) {
        this.atualizado_em = atualizado_em;
    }

    public int getCriado_em() {
        return criado_em;
    }

    public void setCriado_em(int criado_em) {
        this.criado_em = criado_em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    public String getNome_cidade() {
        return nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }
}
