package GestionMuseo;

public class Obra {

    private String codigo;

    private String titulo;

    private String autor;

    public Obra(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return codigo + " - " + titulo + " - " + autor;
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

        Obra obra = (Obra) o;

        return codigo.equalsIgnoreCase(obra.getCodigo());
    }

    @Override

    public int hashCode(){

        return codigo.toUpperCase().hashCode();
    }
}
