package selecciones;
import jugadores.Jugador;
import entrenadores.Entrenador;
import java.util.Objects;
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
        int i;
        for(i=0;i<countJugadores();i++){
            if (jugadores[i]==jugador) {
                
            }
            else {
            }
        }
    }
    public void addJugadores(Jugador jugador){
        int espacio = buscarVacio();
        if (espacio==-1){
            System.out.println("No hay espacio");
        }
        this.jugadores[espacio]=jugador;
        System.out.println("Jugador añadido");
    }
    public int countJugadores(){
        int i;
        for(i=0;i<jugadores.length;i++){
            if(Objects.isNull(jugadores[i])){
                return i+1;
            }
            
        }
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
    public Seleccion(String nombre, Grupos grupo, Entrenador entrenador, Jugador jugadores) {
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
