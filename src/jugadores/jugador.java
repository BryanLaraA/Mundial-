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

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void mosInformacion() {
        System.out.println("Jugador: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Fecha: " + fechadenacimiento);
        System.out.println("Numero: " + numero);
        System.out.println("Posicion: " + posicion);
    }

    public Jugador(int numero, String posicion, String nombre, String nacionalidad, LocalDate fechanacimiento, int edad) {
        super(nombre, nacionalidad, fechanacimiento, edad);
        this.numero = numero;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return nombre + posicion + numero;
    }
}
