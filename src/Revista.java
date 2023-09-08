import java.util.ArrayList;

public class Revista {
    int id;
    String nome;
    int data_aquisicao;
    int anoPubli;
    int volume;
    String editora;
    String assunto;
    ArrayList<String> autores = new ArrayList<String>();

    public Revista(int id, String nome, int data_aquisicao, int anoPubli, int volume, String editora, String assunto,
            ArrayList<String> autores) {
        this.id = id;
        this.nome = nome;
        this.data_aquisicao = data_aquisicao;
        this.anoPubli = anoPubli;
        this.volume = volume;
        this.editora = editora;
        this.assunto = assunto;
        this.autores = autores;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getData_aquisicao() {
        return data_aquisicao;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public int getVolume() {
        return volume;
    }

    public String getEditora() {
        return editora;
    }

    public String getAssunto() {
        return assunto;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData_aquisicao(int data_aquisicao) {
        this.data_aquisicao = data_aquisicao;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }
    
    
}
