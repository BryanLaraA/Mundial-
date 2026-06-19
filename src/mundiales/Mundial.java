package mundiales;
import persona.Persona;

public class Mundial {
    
   private double año;
   private String pais;

    public String getNombre() {
        return nombre;
    }

    public double getAño() {
        return año;
    }

    public String getPais() {
        return pais;
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
