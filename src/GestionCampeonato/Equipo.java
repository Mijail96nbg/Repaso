package GestionCampeonato;

import java.util.HashSet;
import java.util.Set;

public class Equipo {

    private String nombre;

    private String ciudad;

    private Set<Jugador> jugadores;

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
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

        Equipo otro = (Equipo) o;

        return nombre.equalsIgnoreCase(otro.getNombre());
    }

    @Override

    public int hashCode(){

        return nombre.toUpperCase().hashCode();
    }
    @Override
    public String toString() {
        return nombre + " - " + ciudad + " - " + jugadores;
    }

    public boolean agregarJugador(Jugador j){

        if(j == null){

            return false;
        }

        return jugadores.add(j);
    }
}
