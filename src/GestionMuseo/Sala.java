package GestionMuseo;

public class Sala {

    private String codigo;

    private String nombre;

    public Sala(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre;
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

        Sala s = (Sala) o;

        return codigo.equalsIgnoreCase(s.getCodigo());
    }

    @Override

    public int hashCode(){

        return codigo.toUpperCase().hashCode();
    }
}
