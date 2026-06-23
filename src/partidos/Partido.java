/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;

import arbitros.Arbitro;
import java.time.LocalDate;
/**
 *
 * @author Isaac
 */
public class Partido extends Arbitro{
    protected String nombre; 
    protected LocalDate año;
    protected String pais; 
    protected String[] arbitro = new String[20];

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

    public Partido( LocalDate año, String pais, String categoria, String nombre, String nacionalidad, LocalDate fechanacimiento) {
        super(categoria, nombre, nacionalidad, fechanacimiento);
        this.nombre = nombre;
        this.año = año;
        this.pais = pais;
    }

   public boolean agregarArbitro(String newArbitro) {
    for (int i = 0; i < arbitro.length; i++) {
        if (arbitro[i].equals(newArbitro)){
            return false; 
        } if (arbitro[i] == null) {
            arbitro[i] = newArbitro;
            System.out.println("Arbitro agregado");
            }
        }
        return true;
    }
     public void eliminarArbitro(String nombre){
        for (int i = 0; i < arbitro.length; i++){
        if (arbitro[i] != null && arbitro[i].equals(nombre)) {
            arbitro[i] = null;
            System.out.println("Arbitro eliminado");
        }
            }
           }
    
     public void buscarArbitro(String nombre){
        for (int i = 0; i < arbitro.length; i++) {
        if (arbitro[i] != null && arbitro[i].equals(nombre)) {
            System.out.println("Árbitro encontrado en la posición: " + i);
            return;
             }
        }
        System.out.println("Árbitro no encontrado");
        }
 
      public int contarArbitro(){
        int contador = 0;
        
        for (int i = 0; i < arbitro.length; i++) {
        if (arbitro[i] != null) {
            contador++;
        }
    }
        return contador;
    }
}
    
    

    
    
    


    
    
    

