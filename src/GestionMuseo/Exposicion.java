package GestionMuseo;

public class Exposicion {

    private Obra obra;

    private Sala sala;

    private int dias;

    public Exposicion(Obra obra, Sala sala, int dias) {
        this.obra = obra;
        this.sala = sala;
        this.dias = dias;
    }

    public Obra getObra() {
        return obra;
    }

    public Sala getSala() {
        return sala;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return sala.getNombre() + " - " + obra.getTitulo() + " - " + getDias();
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

        Exposicion e = (Exposicion) o;

        return sala.equals(e.getSala()) && obra.equals(e.getObra());
    }

    public int hashCode(){

        return sala.hashCode() + obra.hashCode();
    }
}
