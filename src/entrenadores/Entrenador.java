/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenadores;

/**
 *
 * @author Yumor
 */

import java.time.LocalDate;
import persona.Persona;

public class Entrenador extends Persona {
protected int añosExperiencia; 

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  public void setEdad(int edad) {
        this.edad = edad;
    }  

    public Entrenador(int añosExperiencia, String nombre, String nacionalidad, LocalDate fechanacimiento, int edad) {
        super(nombre, nacionalidad, fechanacimiento);
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "a\u00f1osExperiencia=" + añosExperiencia + '}';
    }

   

  
    
    
    
}
