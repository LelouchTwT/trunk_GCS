import java.util.ArrayList;

public class CD {
    private int id;
    private String nome;
    private String dataAquisicao;
    private ArrayList<String> autores = new ArrayList<String>();
    //Especificas
    private String genero;
    private ArrayList<String> musicas = new ArrayList<String>();

    public CD(int id, String nome, String dataAquisicao, ArrayList<String> autores, String genero, ArrayList<String> musicas) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autores = autores;
        this.genero = genero;
        this.musicas = musicas;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataAquisicao() {
        return this.dataAquisicao;
    }

    public ArrayList<String> getAutores() {
        return this.autores;
    }

    public String getGenero() {
        return this.genero;
    }

    public ArrayList<String> getMusicas() {
        return this.musicas;
    }
    
}

    
