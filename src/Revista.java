import java.util.ArrayList;

public class Revista {
    private int id;
    private String nome;
    private String dataAquisicao;
    private int anoPubli;
    private int volume;
    private String editora;
    private String assunto;
    private ArrayList<String> autores = new ArrayList<String>();

    public Revista(int id, String nome, String dataAquisicao, int anoPubli, int volume, String editora, String assunto,
            ArrayList<String> autores) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
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

    public String getDataAquisicao() {
        return dataAquisicao;
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
}
