package SIstemaGestion;

public class Artista {

    private String codigo;

    private String nombre;

    private String genero;

    @Override
    public String toString() {
        return codigo + " - " + nombre + " - " + genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public Artista(String codigo, String nombre, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
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

        Artista a = (Artista) o;

        return codigo.equalsIgnoreCase(a.getCodigo());
    }

    @Override

    public int hashCode(){

        return codigo.toUpperCase().hashCode();
    }
}
