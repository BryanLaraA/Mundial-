/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;

import java.time.LocalDate;
import persona.Persona;

/**
 *
 * @author Student
 */
public class Jugador extends Persona {

    protected int numero;
    protected String posicion;

    public Jugador(String nombre, String nacionalidad, String fecha, int numero, String posicion) {
        super(nombre, nacionalidad, fechadenacimiento);
        this.numero = numero;
        this.posicion = posicion;
                
    }

    public void mosInformacion() {
        System.out.println("Jugador: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Fecha: " + fechadenacimiento);
        System.out.println("Numero: " + numero);
        System.out.println("Posición: " + posicion);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return nombre + posicion + numero;
    }
}
