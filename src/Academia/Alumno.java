package Academia;

public class Alumno {

    private String dni;

    private String nombre;

    private int edad;

    public Alumno(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
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

        Alumno a = (Alumno) o;

        return dni.equalsIgnoreCase(a.getDni());
    }

    @Override

    public int hashCode(){

        return dni.hashCode();
    }

    @Override
    public String toString() {
        return dni + " - " + nombre + " - " + edad;
    }
}
