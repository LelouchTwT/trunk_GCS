import java.util.ArrayList;

public class Livro {
    private int id;
    private String nome;
    private String dataAquisicao;
    private String editora;
    private int anoPubli;
    private ArrayList<String> autores = new ArrayList<String>();

    public Livro(int id, String nome, String dataAquisicao, String editora, int anoPubli, ArrayList<String> autores) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.editora = editora;
        this.anoPubli = anoPubli;
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

    public String getEditora() {
        return editora;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }
    
        
}
