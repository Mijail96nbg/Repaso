package SIstemaGestion;

import java.util.ArrayList;
import java.util.HashMap;

public class Festival {

    private HashMap<Escenario, ArrayList<Artista>> escenarios;

    private ArrayList<Actuacion> actuaciones;

    public Festival() {

        this.escenarios = new HashMap();

        this.actuaciones = new ArrayList();
    }

    public boolean agregarEscenario(Escenario e) {

        if (e == null) {

            return false;
        }

        if (escenarios.containsKey(e)) {

            return false;
        }

        escenarios.put(e, new ArrayList<>());

        return true;
    }

    public boolean contratarArtista(Escenario e, Artista a) {

        if (e == null) {

            return false;
        }

        if (a == null) {

            return false;
        }

        if (!escenarios.containsKey(e)) {

            return false;
        }

        for (Escenario escenario : escenarios.keySet()) {

            ArrayList<Artista> listas = escenarios.get(escenario);

            if (listas.contains(a)) {

                return false;
            }
        }

        ArrayList<Artista> artistas = escenarios.get(e);

        artistas.add(a);

        return true;
    }

    public boolean registrarActuacion(Actuacion a) {

        if (a == null) {

            return false;
        }

        if (!escenarios.containsKey(a.getEscenario())) {

            return false;
        }


        ArrayList<Artista> lista = escenarios.get(a.getEscenario());

        if(!lista.contains(a.getArtista())){

            return false;
        }


        if (a.getDuracion() <= 0) {

            return false;
        }

        if (actuaciones.contains(a)) {

            return false;
        }

        actuaciones.add(a);

        return true;
    }
}
