import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Catalogo {
    private ArrayList<CD> cds = new ArrayList<CD>();
    private ArrayList<DVD> dvds = new ArrayList<DVD>();
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<Revista> revistas = new ArrayList<Revista>();

    private int cdCurrentId = 0;
    private int dvdCurrentId = 0;
    private int livroCurrentId = 0;
    private int revistaCurrentId = 0;

    public void addCd(String nome, ArrayList<String> autores, String genero, ArrayList<String> musicas) {
        CD aux = new CD(cdCurrentId, nome, getDate(), autores, genero, musicas);
        cds.add(aux);

        cdCurrentId++;
    }

    public void addDvd(String nome, ArrayList<String> autores, int tipo, String descricao) {
        DVD aux = new DVD(dvdCurrentId, nome, getDate(), autores, tipo, descricao);
        dvds.add(aux);

        dvdCurrentId++;
    }

    public void addLivro(String nome, String editora, int anoPubli, ArrayList<String> autores) {
        Livro aux = new Livro(livroCurrentId, nome, getDate(), editora, anoPubli, autores);
        livros.add(aux);

        livroCurrentId++;
    }

    public void addRevista(String nome, int anoPubli, int volume, String editora, String assunto,
            ArrayList<String> autores) {
        Revista aux = new Revista(revistaCurrentId, nome, getDate(), anoPubli, volume, editora, assunto, autores);
        revistas.add(aux);

        revistaCurrentId++;
    }

    public CD searchCd(int id) {
        for (CD cd : cds) {
            if (cd.getId() == id) {
                return cd;
            }
        }
        return null;
    }

    public DVD searchDvd(int id) {
        for (DVD dvd : dvds) {
            if (dvd.getId() == id) {
                return dvd;
            }
        }
        return null;
    }

    public Livro searchLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public Revista searchRevista(int id) {
        for (Revista revista : revistas) {
            if (revista.getId() == id) {
                return revista;
            }
        }
        return null;
    }

    private String getDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        return formatter.format(date);
    }

}
