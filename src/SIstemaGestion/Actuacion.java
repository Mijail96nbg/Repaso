package SIstemaGestion;

public class Actuacion {

    private Artista artista;
    private Escenario escenario;

    private double duracion;

    public Actuacion(Artista artista, Escenario escenario, double duracion) {
        this.artista = artista;
        this.escenario = escenario;
        this.duracion = duracion;
    }

    public Artista getArtista() {
        return artista;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return escenario.getNombre() + " - " + artista.getNombre() + " - " + duracion;
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

        Actuacion a = (Actuacion) o;

        return artista.equals(a.getArtista()) && escenario.equals(a.getEscenario());
    }

    @Override

    public int hashCode(){

        return artista.hashCode() + escenario.hashCode();
    }

}
