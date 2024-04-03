/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1;

/**
 *
 * @author Soporte
 */
public class Gato {
    private String Nombre;
    public Gato() {
        this.Nombre="Felix";
    }
    public Gato(String nombre) {
        this.Nombre = nombre;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void emiteSonido() {
        System.out.println("dice MEOW");
    }

    
}
