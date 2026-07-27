package SIstemaGestion;

public class Escenario {

    private String codigo;

    private String nombre;

    public Escenario(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
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

        Escenario e = (Escenario) o;

        return codigo.equalsIgnoreCase(e.getCodigo());
    }

    @Override

    public int hashCode(){

        return codigo.toUpperCase().hashCode();
    }
}
