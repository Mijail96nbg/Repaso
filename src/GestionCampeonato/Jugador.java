package GestionCampeonato;

public class Jugador {

    private String dni;

    private String nombre;

    private String posicion;

    public Jugador(String dni, String nombre, String posicion) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return dni + " - " + nombre + " - " + posicion;
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

        Jugador otro = (Jugador) o;

        return dni.equalsIgnoreCase(otro.getDni());
    }

    @Override

    public int hashCode(){

        return dni.toUpperCase().hashCode();
    }
}
