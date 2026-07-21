package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public void añadirLibro(Libro l) {

        if (libros.contains(l)) {

            System.out.println("El libro ya esta en la bibliotca");

            return;
        }

        libros.add(l);

        System.out.println("Libro añadido");

    }

    public Libro buscarLibro(String isbn) {

       for(Libro l : libros){

           if(l.getIsbn().equalsIgnoreCase(isbn)){

               return l;
           }
       }


       return null;

    }

    public void prestarLibro(String isbn){

        Libro libro = buscarLibro(isbn);

        if(libro == null){

            System.out.println("El libro no existe");

            return;
        }

        if(!libro.isDisponible()){

            System.out.println("El libro ya esta prestado");

            return;
        }

        libro.setDisponible(false);

        System.out.println("Libro prestado");
    }

    public void devolverLibro(String isbn){

        Libro libro = buscarLibro(isbn);

        if(libro == null){

            System.out.println("El libro no existe");

            return;
        }

        if(libro.isDisponible()){

            System.out.println("El libro no esta prestado");

            return;
        }

        libro.setDisponible(true);

        System.out.println("El libro ha sido devuelto");
    }
}
