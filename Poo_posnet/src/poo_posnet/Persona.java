/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_posnet;

/**
 *
 * @author Soporte
 */
public class Persona {
    private String DPI;
    private String nombre;
    private String apellido;
    private String Telefono;
    private String mail;
    public Persona(String DPI, String nombre, String apellido, String telefono, String mail) {
        this.DPI=DPI;
        this.nombre=nombre;
        this.apellido=apellido;
        this.Telefono=telefono;
        this.mail=mail;
    }
    public String getNombreCompleto()
    {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "DPI=" + DPI + ", nombre=" + nombre + ", apellido=" + apellido + ", Telefono=" + Telefono + ", mail=" + mail + '}';
    }
    
}
