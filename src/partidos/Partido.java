/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;

import java.time.LocalDate;
/**
 *
 * @author Isaac
 */
public class Partido {
    protected String nombre; 
    protected LocalDate año;
    protected String pais; 

    public String getNombre() {
        return nombre;
    }

    public LocalDate getAño() {
        return año;
    }

    public String getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Partido(String nombre, LocalDate año, String pais) {
        this.nombre = nombre;
        this.año = año;
        this.pais = pais;
    }

    
    }
    
    
    
    
    


    
    
    

