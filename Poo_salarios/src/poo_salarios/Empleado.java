/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_salarios;

import java.time.LocalDate;

/**
 *
 * @author Soporte
 */
public abstract class Empleado {
    private String dpi;
    private String nombre;
    private String apellido;
    private int anioIngreso;
    public Empleado(String dpi, String nombre, String apellido, int anioIngreso)
    {
        this.dpi=dpi;
        this.nombre=nombre;
        this.apellido=apellido;
        this.anioIngreso=anioIngreso;
    }
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    public int antiguedadEnAnios()
    {
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioIngreso;
    }
    public abstract double getSalario();

    @Override
    public String toString() {
        return "Empleado{" + "dpi=" + dpi + ", nombre=" + nombre + ", apellido=" + apellido + ", anioIngreso=" + anioIngreso + '}';
    }
    
}
