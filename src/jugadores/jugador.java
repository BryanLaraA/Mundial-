/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;

/**
 *
 * @author Student
 */

public class jugador {
    private String nombre;
    private int edad;
    private String posicion;
    private int numeroCamiseta;
    private int goles;

    public jugador(String nombre, int edad, String posicion, int numeroCamiseta, int goles) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public int getGoles() {
        return goles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void anotarGol() {
        this.goles++;
    }

    @Override
    public String toString() {
        return "Jugador: " + "nombre='" + nombre +", edad=" + edad +", posicion='" + posicion +", numeroCamiseta=" + numeroCamiseta +", goles=" + goles ;
    }

}
