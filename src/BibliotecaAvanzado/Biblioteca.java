package BibliotecaAvanzado;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    private HashMap<String, Libro> libros;

    private HashMap<String, Socio> socios;

    private Set<Prestamos> prestamos;

    public Biblioteca() {

        this.libros = new HashMap<>();

        this.socios = new HashMap<>();

        this.prestamos = new HashSet<>();
    }

    public boolean agregarLibro(Libro l) {

        if (l == null) {

            return false;
        }

        if (libros.containsKey(l.getIsbn())) {

            return false;
        }

        libros.put(l.getIsbn(), l);

        return true;
    }

    public boolean agregarSocio(Socio s) {

        if (s == null) {

            return false;
        }

        if (socios.containsKey(s.getDni())) {

            return false;
        }

        socios.put(s.getDni(), s);

        return true;
    }

    public boolean realizarPrestamo(String isbn, String dni) {

        if (!socios.containsKey(dni)) {

            return false;
        }

        if (!libros.containsKey(isbn)) {

            return false;
        }

        LocalDate fechaPrestamo = LocalDate.now();

        LocalDate fechaDevolucion = fechaPrestamo.plusDays(30);

        Prestamos prestamo = new Prestamos(libros.get(isbn), socios.get(dni), fechaPrestamo, fechaDevolucion, false);

        for (Prestamos p : prestamos) {

            if (p.getLibro().getIsbn().equalsIgnoreCase(isbn) && !p.isDevuelto()) {

                return false;
            }
        }

        prestamos.add(prestamo);

        return true;
    }

    public boolean devolverLibro(String isbn) {

        if (!libros.containsKey(isbn)) {

            return false;
        }

        for (Prestamos p : prestamos) {

            if (p.getLibro().getIsbn().equalsIgnoreCase(isbn)) {

                if (p.isDevuelto()) {

                    return false;
                }

                p.setDevuelto(true);

                return true;
            }
        }

        return false;
    }

    public void mostrarLibrosDisponibles() {

        for (Libro l : libros.values()) {

            boolean disponible = true;


            for (Prestamos p : prestamos) {

                if (p.getLibro().getIsbn().equalsIgnoreCase(l.getIsbn()) && !p.isDevuelto()) {

                    disponible = false;

                }


            }

            if (disponible) {

                System.out.println(l.toString());
            }
        }
    }

    public void mostrarPrestamosSocio(String dni){

        if(dni == null){

            return;
        }

        if(!socios.containsKey(dni)){

            return ;
        }

        for(Prestamos p : prestamos){

            if(p.getSocio() == socios.get(dni)){

                System.out.println(p.getLibro().toString());
                System.out.println(p.getSocio().toString());
                System.out.println(p.getFechaPrestamo());
                System.out.println(p.getFechaDevolucion());
                System.out.println(p.isDevuelto());
            }
        }
    }
}
