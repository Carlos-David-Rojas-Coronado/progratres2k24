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
public class Poo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato miGato = new Gato();
        System.out.println("El Gato se llama: " + miGato.getNombre());
        miGato.emiteSonido();
        Gato miGato2 = new Gato("Garfield");
        System.out.println("El segundo gato se llama: " + miGato2.getNombre());
    }
    
}
