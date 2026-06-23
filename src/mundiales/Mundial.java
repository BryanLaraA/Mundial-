package mundiales;
import persona.Persona;
import selecciones.Seleccion;
import java.util.Objects;
import java.util.Scanner;
import selecciones.Grupos;

public class Mundial {
   private String nombre;
   private double año;
   private String pais;
   private Seleccion selecciones [];
   private String partidos;
           Scanner scanner = new Scanner(System.in);

   
   
    public String getNombre() {
        return nombre;
    }

    public double getAño() {
        return año;
    }

    public String getPais() {
        return pais;
    }

    public Seleccion[] getSelecciones() {
        return selecciones;
    }
    
    public String getAgregarSeleccion(){
        return agregarSeleccion();
    }
    
    public String getEliminarSelection(){
        return eliminarSeleccion();
    }
    
    public String getBuscarSeleccionNombre(){
        return buscarSeleccionNombre();
    }
    
    public int getContarCantidadSelcciones(){
        return contarCantidadSelcciones();
    }
    
    public boolean getVerificarSeleccionEscrita(){
        return verificarSeleccionEscrita();
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAño(double año) {
        this.año = año;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public void agregarSeleccion(Seleccion seleccion){
        int espacio = buscarVacio();
        if (espacio==-1){
            System.out.println("No hay campo");
        }else
            this.selecciones[espacio]=seleccion;
        System.out.println("Seleccion añadida");
    }

    public void eliminarSeleccion(){
        for (i=0;i < selecciones.length;i--){
            if(selecciones[i]==null){
                return i;
    }
    
    private void buscarSeleccionNombre(String nombre){
        int i=0;
        for (i=0;i < selecciones.length;i++){
            if(selecciones[i]==nombre){
                return nombre;
    }
    
    private void contarCantidadSelcciones(){
        int i=0;
        for (i=0;i < selecciones.length;i++){
                return i;
        }
    }
    
    public boolean isverificarSeleccionEscrita(){
        int i=0;
        for (i=0;i < selecciones.length;i++){
            if(selecciones[i]===true){
                return true;
    }
    }
        
    public void ObtenerSeleccionesGrupo(Grupos seleccion){
        return seleccion;
    }
    
    public void agregarPatido(){
    }
    
    public void elimminarPartido(){
    }
    
    public void cantidadPartidosRegistrados(){
    }
    
    public void todosLosPartidosSeleccion(){
    }
    
    public FechaTodosLosPartidos(){
        
    }
    public int buscarVacio(){
        int i=0;
        for (i=0;i < selecciones.length;i++){
            if(selecciones[i]==null){
                return i;
            }
        }
    }      
    
    
    public Mundial(String nombre, double año, String pais) {
        this.nombre = nombre;
        this.año = año;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Mundial{" + "nombre=" + nombre + ", a\u00f1o=" + año + ", pais=" + pais + '}';
    }
   
    
}
