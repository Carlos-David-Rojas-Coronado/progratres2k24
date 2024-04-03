/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_0;

/**
 *
 * @author Soporte
 */
public class Gato {
    private String Nombre;
    public Gato(){
        Nombre="Felix";
    }
    public Gato(String Nombre){
        this.Nombre=Nombre;
    }
     public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void emiteSonido() {
        System.out.println("mi gato dice MEOW");
    }
            
}
