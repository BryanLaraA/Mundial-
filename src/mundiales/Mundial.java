package mundiales;
import persona.Persona;
import selecciones.Seleccion;
import java.util.Objects;
public class Mundial {
   private String nombre;
   private double año;
   private String pais;
   private Seleccion selecciones [];
   private 

    public String getNombre() {
        return nombre;
    }

    public double getAño() {
        return año;
    }

    public String getPais() {
        return pais;
    }
    
    public 
    
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
    
    private String agregarSeleccion(){
        return 
    }

    private String eliminarSeleccion(){
        return
    }
    
    private String buscarSeleccionNombre(){
        return 
    }
    
    private int contarCantidadSelcciones(){
        return
    }
    
    public boolean isverificarSeleccionEscrita(){
        return 
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
