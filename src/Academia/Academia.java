package Academia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Academia {

    private HashMap<Curso, HashSet<Alumno>> gestion;

    public Academia() {

        this.gestion = new HashMap<Curso, HashSet<Alumno>>();
    }

    public void agregarCurso(Curso c) {

        if (gestion.containsKey(c)) {

            System.out.println("El curso ya esta en la academia");

            return;
        }

        gestion.put(c, new HashSet<>());
    }

    public void inscribirAlumno(Alumno a, Curso c) {

        if (!gestion.containsKey(c)) {

            System.out.println("El curso no esta en la academia");

            return;
        }

        if (a == null) {

            System.out.println("Alumno no valido");

            return;
        }

        HashSet<Alumno> alumnos = gestion.get(c);

        if (c.getPlazasMaximas() <= alumnos.size() ) {

            System.out.println("No hay plazas");

            return;
        }


        if (alumnos.add(a)) {

            System.out.println("Alumno inscrito");
        } else {

            System.out.println("El alumno ya esta inscrito");
        }
    }

    public void mostrarAlumnos(Curso c){

        if(!gestion.containsKey(c)){

            System.out.println("El curso no esta en la acadmeia");

            return;
        }

        for(Alumno a : gestion.get(c)){

            System.out.println(a);
        }
    }

    public void mostrarCursos(){

        for(Curso c : gestion.keySet()){

            System.out.println(c.getNombre());

            System.out.println("---------------");

            mostrarAlumnos(c);

            System.out.println();

        }
    }
}

