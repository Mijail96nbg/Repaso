package BibliotecaAvanzado;

import java.util.Objects;

public class Socio {

    private String dni;

    private String nombre;

    private String telefono;

    public Socio(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return dni + " - " + nombre + " - " + telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return dni.equalsIgnoreCase(socio.getDni());
    }

    @Override
    public int hashCode() {
        return dni.toUpperCase().hashCode();
    }
}
