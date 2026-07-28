package BibliotecaAvanzado;

import java.time.LocalDate;

public class Prestamos {

    private Libro libro;

    private Socio socio;

    private LocalDate fechaPrestamo;

    private LocalDate fechaDevolucion;

    private boolean devuelto;


    public Prestamos(Libro libro, Socio socio, LocalDate fechaPrestamo, LocalDate fechaDevolucion, boolean
                     devuelto) {
        this.libro = libro;
        this.socio = socio;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public Libro getLibro() {
        return libro;
    }

    public Socio getSocio() {
        return socio;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }


}
