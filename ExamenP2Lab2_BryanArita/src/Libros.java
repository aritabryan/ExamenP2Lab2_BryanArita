
public class Libros {
private String Titulo, Autor, ISBN;

    public Libros(String Titulo, String Autor, String ISBN) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return  Titulo + ", " + Autor + ", " + ISBN;
    }

}
