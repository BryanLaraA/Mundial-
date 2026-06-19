/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Isaac
 */
public class Partido {
    private String Equipolocal;
    private String EquipoVisitante;
    private LocalDate fechaPartido;
    private LocalTime horaPartido;
    private String ubicacion; 
    private int marcadorz;
    private int marcadorLocal;
    private int marcadorVisitante;

    public String getEquipolocal() {
        return Equipolocal;
    }

    public String getEquipoVisitante() {
        return EquipoVisitante;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public LocalTime getHoraPartido() {
        return horaPartido;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getMarcadorz() {
        return marcadorz;
    }

    public int getMarcadorLocal() {
        return marcadorLocal;
    }

    public int getMarcadorVisitante() {
        return marcadorVisitante;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setMarcadorz(int marcadorz) {
        this.marcadorz = marcadorz;
    }

    public void setMarcadorLocal(int marcadorLocal) {
        this.marcadorLocal = marcadorLocal;
    }

    public void setMarcadorVisitante(int marcadorVisitante) {
        this.marcadorVisitante = marcadorVisitante;
    }

    public Partido(String Equipolocal, String EquipoVisitante, LocalDate fechaPartido, LocalTime horaPartido, String ubicacion, int marcadorz, int marcadorLocal, int marcadorVisitante) {
        this.Equipolocal = Equipolocal;
        this.EquipoVisitante = EquipoVisitante;
        this.fechaPartido = fechaPartido;
        this.horaPartido = horaPartido;
        this.ubicacion = ubicacion;
        this.marcadorz = marcadorz;
        this.marcadorLocal = marcadorLocal;
        this.marcadorVisitante = marcadorVisitante;
    }


    
    
    
}
