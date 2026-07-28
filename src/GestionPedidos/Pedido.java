package GestionPedidos;

import java.util.HashSet;
import java.util.Set;

public class Pedido {

    private int codigoPedido;

    private Cliente cliente;

    private Set<Producto> productos;

    public Pedido(int codigoPedido, Cliente cliente) {
        this.codigoPedido = codigoPedido;
        this.cliente = cliente;
        this.productos = new HashSet<>();
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Set<Producto> getProductos() {
        return productos;
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

        Pedido otro = (Pedido) o;

        return codigoPedido == otro.getCodigoPedido();
    }

    @Override

    public int hashCode(){

         return codigoPedido;
    }

    @Override
    public String toString() {
        return codigoPedido + " - " + cliente + " - " +  productos.toString();
    }

    public boolean agregarProducto(Producto producto){

        if(producto == null){

            return false;
        }

        return productos.add(producto);
    }

    public double calcularImporte(){

        double importe = 0;

        for(Producto p : productos){

            importe += p.getPrecio();
        }

        return importe;
    }
}
