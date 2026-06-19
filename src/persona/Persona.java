
package persona;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
    protected String nombre;
    protected String nacionalidad;
    protected LocalDate fechadenacimiento;
    protected int edad;

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }
    
     public int getEdad(){
        return Period.between(fechadenacimiento, LocalDate.now()).getYears();
    }
    

    public Persona(String nombre, String nacionalidad, LocalDate fechanacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechadenacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre 
                + ", nacionalidad=" + nacionalidad 
                + ", fecha=" + fechadenacimiento;
    }
    
    
    
    
    
    
    
            
}
