package GestionPedidos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GestionPedidos {

    private Map<String, Producto> productos;

    private Map<String, Cliente> clientes;

    private Set<Pedido> pedidos;

    public GestionPedidos() {

        this.productos = new HashMap<>();

        this.clientes = new HashMap<>();

        this.pedidos = new HashSet<>();
    }

    public boolean agregarCliente(Cliente c) {

        if (c == null) {

            return false;
        }

        if (clientes.containsKey(c.getDni())) {

            return false;
        }

        clientes.put(c.getDni(), c);

        return true;
    }

    public boolean agregarProducto(Producto p) {

        if (p == null) {

            return false;
        }

        if (productos.containsKey(p.getCodigoProducto())) {

            return false;
        }

        productos.put(p.getCodigoProducto(), p);

        return true;
    }

    public boolean crearPedido(int codigoPedido, String dni) {

        if (!clientes.containsKey(dni)) {

            return false;
        }

        Pedido p = new Pedido(codigoPedido, clientes.get(dni));

        if (pedidos.contains(p)) {

            return false;
        }

        pedidos.add(p);

        return true;
    }

    public boolean agregarProductoAPedido(int codigoPedido, String codigoProducto) {

        if (!productos.containsKey(codigoProducto)) {

            return false;
        }

        for (Pedido p : pedidos) {


            if (p.getCodigoPedido() == codigoPedido) {

                return p.agregarProducto(productos.get(codigoProducto));


            }
        }

        return false;
    }

    public double calcularImportePedido(int codigoPedido) {

        for (Pedido p : pedidos) {

            if (p.getCodigoPedido() == codigoPedido) {

                return p.calcularImporte();
            }
        }

        return 0;
    }
}
