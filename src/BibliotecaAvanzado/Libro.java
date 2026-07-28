package BibliotecaAvanzado;

public class Libro {

    private String isbn;

    private String titulo;

    private String autor;

    private int añoPublicacion;

    public Libro(String isbn, String titulo, String autor, int añoPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    @Override
    public String toString() {
        return isbn + " - " + titulo + " - " + autor + " - " + añoPublicacion;
    }

    @Override

    public boolean equals(Object o){

        if(this == o){

            return true;
        }

        if(o == null){

            return false;
        }

        if(getClass() != o.getClass()){

            return false;
        }

        Libro l = (Libro) o;

        return isbn.equalsIgnoreCase(l.getIsbn());
    }

    @Override

    public int hashCode(){

        return isbn.toUpperCase().hashCode();
    }
}
