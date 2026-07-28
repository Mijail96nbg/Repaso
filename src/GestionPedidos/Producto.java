package GestionPedidos;

public class Producto {

    private String codigoProducto;

    private String nombre;

    private double precio;

    public Producto(String codigoProducto, String nombre, double precio) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigoProducto + " - " + nombre + " - " + precio;
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

        Producto otro = (Producto) o;

        return codigoProducto.equalsIgnoreCase(otro.getCodigoProducto());
    }

    @Override

    public int hashCode(){

        return codigoProducto.toUpperCase().hashCode();
    }
}
