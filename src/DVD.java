import java.util.ArrayList;

public class DVD {
    private int id;
    private String nome;
    private String dataAquisicao;
    private ArrayList<String> autores = new ArrayList<String>();

    private int tipo;
    private String descricao;

    public DVD(int id, String nome, String dataAquisicao, ArrayList<String> autores, int tipo, String descricao) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autores = autores;
        this.tipo = tipo;
        this.descricao = descricao;
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

    public int getTipo() {
        return this.tipo;
    }
    public String getDescricao() {
        return this.descricao;
    }
}
