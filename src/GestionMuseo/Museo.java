package GestionMuseo;

import java.util.ArrayList;
import java.util.HashMap;

public class Museo {

    private HashMap<Sala, ArrayList<Obra>> salas;

    private ArrayList<Exposicion> exposiciones;

    public Museo() {

        this.salas = new HashMap<>();

        this.exposiciones = new ArrayList<>();
    }

    public boolean agregarSala(Sala s) {

        if (s == null) {

            return false;
        }

        if (salas.containsKey(s)) {

            return false;
        }

        salas.put(s, new ArrayList<>());

        return true;
    }

    public boolean asignarObra(Sala s, Obra o) {

        if (s == null) {

            return false;
        }

        if (o == null) {

            return false;
        }

        if (!salas.containsKey(s)) {

            return false;
        }

        for (Sala sala : salas.keySet()) {

            ArrayList<Obra> lista = salas.get(sala);

            if (lista.contains(o)) {

                return false;
            }
        }

        ArrayList<Obra> obras = salas.get(s);


        obras.add(o);

        return true;
    }



}
