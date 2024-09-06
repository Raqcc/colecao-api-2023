package Pesquisa;

public class Livro {
    //atributos

    private String titulo;

    private String autor;

    private int anoPulicacao;

    public Livro(String titulo, int anoPulicacao, String autor) {
        this.titulo = titulo;
        this.anoPulicacao = anoPulicacao;
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPulicacao() {
        return anoPulicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPulicacao=" + anoPulicacao +
                '}';
    }
}
}

