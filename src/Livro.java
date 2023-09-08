import java.util.ArrayList;

public class Livro {
    int id;
    String nome;
    int data_aquisicao;
    String editora;
    int anoPubli;
    ArrayList<String> autores = new ArrayList<String>();

    public Livro(int id, String nome, int data_aquisicao, String editora, int anoPubli, ArrayList<String> autores) {
        this.id = id;
        this.nome = nome;
        this.data_aquisicao = data_aquisicao;
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

    public int getData_aquisicao() {
        return data_aquisicao;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData_aquisicao(int data_aquisicao) {
        this.data_aquisicao = data_aquisicao;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }
    
        
}
