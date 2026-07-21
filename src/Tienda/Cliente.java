package Tienda;

import java.util.ArrayList;

public class Cliente {


    private String dni;

    private String nombre;

    private ArrayList<Producto> productosComprados;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.productosComprados = new ArrayList<Producto>();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void comprarProducto(Producto p){

        productosComprados.add(p);
    }

    public void mostrarCompras(){

        for(Producto p : productosComprados){

            System.out.println(p);
        }
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

        Cliente c = (Cliente) o;

        return dni.equalsIgnoreCase(c.getDni());
    }

    @Override

    public int hashCode(){

        return dni.hashCode();
    }
}
