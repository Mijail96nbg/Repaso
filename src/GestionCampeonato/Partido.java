package GestionCampeonato;

public class Partido {

    private String codigo;

    private Equipo equipoLocal;

    private Equipo equipoVisitante;

    private int golesLocal;

    private int golesVisitante;

    public Partido(String codigo, Equipo equipoLocal, Equipo equipoVisitante) {
        this.codigo = codigo;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = 0;
        this.golesVisitante = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
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

        Partido otro = (Partido) o;

        return codigo.equalsIgnoreCase(otro.getCodigo());
    }

    @Override

    public int hashCode(){

        return codigo.toUpperCase().hashCode();
    }

    public void registrarResultado(int golesLocal, int golesVisitante){

        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
}
