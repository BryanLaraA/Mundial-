package selecciones;
import jugadores.Jugador;
import entrenadores.Entrenador;
import java.util.Arrays;
public class Seleccion {
    private String nombre;
    private Grupos grupo;
    private Entrenador entrenador;
    private Jugador jugadores[];
    public String getNombre() {
        return nombre;
    }
    public Grupos getGrupo() {
        return grupo;
    }
    public Entrenador getEntrenador() {
        return entrenador;
    }
    public Jugador[] getJugadores() {
        return jugadores;
    }
    public void setGrupo(Grupos grupo) {
        this.grupo = grupo;
    }
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    public void addJugadores(Jugador jugador){
        int espacio = buscarVacio();
        if (espacio==-1){
            System.out.println("No hay espacio");
        }
        else{
        this.jugadores[espacio]=jugador;
        System.out.println("Jugador añadido");
        }
    }
    public void deleteJugadores(Jugador jugador){
        int i;
        boolean encontrado = false;
        for(i=0;i<jugadores.length;i++){
            if (jugadores[i]==jugador) {
                jugadores[i]=null;
                encontrado=true;
                break;
            }
        }
        if(encontrado){
            System.out.println("Jugador encontrado");
        }
        else{
        System.out.println("Jugador no encontrado");
        }
    }    
    public int BuscarJugador(String nombreJugador){
        int i;
        for(i=0;i<jugadores.length;i++){
            if (jugadores[i]!=null && jugadores[i].getNombre().equals(nombreJugador)){
                return i;
            }
        }
        return -1;
    }
    public boolean someJugador(int numeroJugador){
        int i;
        for(i=0;i<jugadores.length;i++){
            if (jugadores[i]!=null && jugadores[i].getNumero() == numeroJugador){
                return(true);
            }
        }
        return(false);
    }
    public int countJugadores(){
        int i;
        int cantidad = 0;
        for(i=0;i<jugadores.length;i++){
            if(jugadores[i]!=null){
                cantidad++;
            }
        }
        return cantidad;
    }
    public int buscarVacio(){
        int i=0;
        for(i=0;i<jugadores.length;i++){
            if(jugadores[i]==null){
                return i;
            }
        }    
        return -1;
    }
    public Seleccion(String nombre, Grupos grupo, Entrenador entrenador, Jugador[] jugadores) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.entrenador = entrenador;
        this.jugadores = jugadores;
    }
    @Override
    public String toString() {
        return "Seleccion: " + 
                "\nnombre: " + nombre + 
                "\ngrupo=" + grupo + 
                "\nentrenador=" + entrenador + 
                "\njugadores=" + Arrays.toString(jugadores);
    }
}