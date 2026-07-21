package Tienda;

public class Producto {

    private String codigo;

    private String nombre;

    private double precio;

    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

        Producto p = (Producto) o;

        return codigo.equalsIgnoreCase(p.getCodigo());
    }

    @Override

    public int hashCode(){

        return codigo.hashCode();
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " - " + precio + " - " + stock;
    }
}
