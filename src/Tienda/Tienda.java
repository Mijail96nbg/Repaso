package Tienda;


import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;

    private ArrayList<Cliente> clientes;

    public Tienda() {

        this.clientes = new ArrayList<Cliente>();

        this.productos = new ArrayList<Producto>();
    }

    public void añadirProducto(Producto p){

        if(productos.contains(p)){

            System.out.println("El producto ya esta añaiddo");

            return;
        }

        productos.add(p);
    }

    public void registrarCliente(Cliente c){

        if(clientes.contains(c)){

            System.out.println("El cliente ya esta registrado");

            return;
        }

        clientes.add(c);
    }

    public Producto buscarProducto(String codigo){

        for(Producto p : productos){

            if(p.getCodigo().equalsIgnoreCase(codigo)){

                return p;
            }
        }


        return null;
    }

    public Cliente buscarCliente(String dni){

        for(Cliente c : clientes){

            if(c.getDni().equalsIgnoreCase(dni)){

                return c;
            }
        }

        return null;
    }

    public void venderProducto(String dni, String codigo){

        Cliente cliente = buscarCliente(dni);

        if(cliente == null){

            System.out.println("El cliente no existe");

            return;
        }

        Producto producto = buscarProducto(codigo);

        if(producto == null){

            System.out.println("El producto no existe");

            return;
        }

        if(producto.getStock() == 0){

            return;
        }

        producto.setStock(producto.getStock() - 1);

        cliente.comprarProducto(producto);

        System.out.println("Producto comprado");

    }

    public void mostrarProductos(){

        for(Producto p : productos){

            System.out.println(p.toString());
        }
    }

    public void mostrarClientes(){

        for(Cliente c : clientes){

            System.out.println(c.getNombre());

            c.mostrarCompras();
        }
    }
}
