    package GestionCampeonato;

    import java.util.HashMap;
    import java.util.HashSet;
    import java.util.Map;
    import java.util.Set;

    public class GestionCampeonato {

        private Map<String, Jugador> jugadores;

        private Map<String, Equipo> equipos;

        private Set<Partido> partidos;

        public GestionCampeonato() {

            this.jugadores = new HashMap<>();
            this.equipos = new HashMap<>();
            this.partidos = new HashSet<>();
        }

        public boolean agregarJugador(Jugador j) {

            if (j == null) {

                return false;
            }

            if (jugadores.containsKey(j.getDni().toUpperCase())) {

                return false;
            }

            jugadores.put(j.getDni().toUpperCase(), j);

            return true;
        }

        public boolean agregarEquipo(Equipo e) {

            if (e == null) {

                return false;
            }

            if (equipos.containsKey(e.getNombre().toUpperCase())) {

                return false;
            }

            equipos.put(e.getNombre().toUpperCase(), e);

            return true;
        }

        public boolean ficharJugador(String dni, String nombreEquipo) {


            if (!jugadores.containsKey(dni.toUpperCase())) {

                return false;
            }

            if (!equipos.containsKey(nombreEquipo.toUpperCase())) {

                return false;
            }

            Equipo equipo = equipos.get(nombreEquipo.toUpperCase());

            Jugador jugador = jugadores.get(dni.toUpperCase());

            return equipo.agregarJugador(jugador);

        }

        public boolean crearPartido(String codigo, String nombreLocal, String nombreVisitante) {

            if (!equipos.containsKey(nombreLocal.toUpperCase()) || !equipos.containsKey(nombreVisitante.toUpperCase())) {

                return false;
            }

            if (nombreLocal.equalsIgnoreCase(nombreVisitante)) {

                return false;
            }

            Partido buscado = new Partido(codigo.toUpperCase(), null, null);

            if (partidos.contains(buscado)) {

                return false;
            }


            Equipo local = equipos.get(nombreLocal.toUpperCase());
            Equipo visitante = equipos.get(nombreVisitante.toUpperCase());

            Partido partido = new Partido(codigo.toUpperCase(), local, visitante);

            partidos.add(partido);

            return true;
        }

        public boolean registrarResultado(String codigo, int golesLocal, int golesVisitante) {


            for (Partido p : partidos) {

                if (p.getCodigo().equalsIgnoreCase(codigo)) {

                    p.registrarResultado(golesLocal, golesVisitante);

                    return true;
                }
            }

            return false;
        }

        public void mostrarPartidosEquipo(String nombreEquipo) {

            if (!equipos.containsKey(nombreEquipo.toUpperCase())) {

                return;
            }

            Equipo equipo = equipos.get(nombreEquipo.toUpperCase());

            for (Partido p : partidos) {

                if (p.getEquipoLocal().equals(equipo) || p.getEquipoVisitante().equals(equipo)) {

                    System.out.println(p.getEquipoLocal().getNombre() + ": " + p.getGolesLocal() + " - " + p.getEquipoVisitante().getNombre()
                            + ": " + p.getGolesVisitante());
                }
            }


        }

        public int calcularPuntosEquipo(String nombreEquipo){

            if(!equipos.containsKey(nombreEquipo.toUpperCase())){

                return 0;
            }

            int puntos = 0;

            Equipo equipo = equipos.get(nombreEquipo.toUpperCase());

            for(Partido p : partidos){

                if(p.getEquipoLocal().equals(equipo)){

                    if(p.getGolesLocal() > p.getGolesVisitante()){

                        puntos +=3;
                    }else if(p.getGolesLocal() == p.getGolesVisitante()){

                        puntos+=1;
                    }

                }

                if(p.getEquipoVisitante().equals(equipo)){

                    if(p.getGolesVisitante() > p.getGolesLocal()){

                        puntos +=3;
                    }else if(p.getGolesVisitante() == p.getGolesLocal()){

                        puntos+=1;
                    }
                }
            }
            return puntos;

        }


    }
