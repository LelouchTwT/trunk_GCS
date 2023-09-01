import java.util.ArrayList;

public class CD {
    int id;
    String nome;
    int data_aquisicao;
    ArrayList<String> autores = new ArrayList<String>();
    //Especificas
    String genero;
    ArrayList<String> musicas = new ArrayList<String>();

    public CD(int id, String nome, int data_aquisicao, ArrayList<String> autores, String genero, ArrayList<String> musicas) {
        this.id = id;
        this.nome = nome;
        this.data_aquisicao = data_aquisicao;
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

    public int getData_aquisicao() {
        return this.data_aquisicao;
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

    
