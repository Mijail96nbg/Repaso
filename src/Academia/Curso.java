package Academia;

public class Curso {

    private String codigo;

    private String nombre;

    private int plazasMaximas;

    public Curso(String codigo, String nombre, int plazasMaximas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.plazasMaximas = plazasMaximas;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPlazasMaximas() {
        return plazasMaximas;
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

        Curso c = (Curso) o;

        return codigo.equalsIgnoreCase(c.getCodigo());
    }

    @Override

    public int hashCode(){

        return codigo.hashCode();
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " - " + plazasMaximas;
    }
}
