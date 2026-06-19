/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitros;

import java.time.LocalDate;
import persona.Persona;

/**
 *
 * @author Student
 */
public class Arbitro extends Persona {

    public Arbitro(String categoria, String nombre, String nacionalidad, LocalDate fechanacimiento) {
        super(nombre, nacionalidad, fechanacimiento);
        this.categoria = categoria;
    }

    

    private final String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechadenacimiento(LocalDate fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Arbitro");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Fecha: " + fechadenacimiento);
        System.out.println("Categoria: " + categoria);
    }

    @Override
    public String toString() {
        return nombre + categoria;
    }
}
