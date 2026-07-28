package GestionPedidos;

public class Cliente {

    private String dni;

    private String nombre;

    private String telefono;

    public Cliente(String dni, String nombre, String telefono) {
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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return dni + " - " + nombre + " - " + telefono;
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

        Cliente otro = (Cliente) o;

        return dni.equalsIgnoreCase(otro.getDni());
    }

    @Override

    public int hashCode(){

        return dni.toUpperCase().hashCode();
    }
}
