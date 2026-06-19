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
    public Seleccion(String nombre, Grupos grupo, Entrenador entrenador, Jugador[] jugadores) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.entrenador = entrenador;
        this.jugadores = jugadores;
    }
    public void deleteJugadores(Jugador jugador){
        while(true){
            
        }
    }
    public void addJugadores(Jugador jugador){
        this.jugadores[buscarVacio()]=jugador;
    }
    public int buscarVacio(){
        int i=0;
        while(true){
            if(jugadores[i]==null){
                return i;
            }
            i++;
        }      
    }
    public Seleccion(String nombre, Grupos grupo, Entrenador entrenador, Jugador jugado) {
        this.nombre = nombre;
        this.grupo = grupo;
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
