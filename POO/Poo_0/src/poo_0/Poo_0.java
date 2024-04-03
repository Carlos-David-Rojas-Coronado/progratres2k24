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
public class Poo_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instancia de la Clase Gato
        Gato miGato = new Gato();
        //Imprimir el nombre del gato
        System.out.println("El nombre del primer gato es: " + miGato.getNombre()); 
        Gato miGato2 = new Gato("Garfield");
        System.out.println("El nombre del segundo gato es: " + miGato2.getNombre());
        Gato miGato3 = new Gato();
        System.out.println("El nombre del tercer gato es: " + miGato3.getNombre());
        miGato3.setNombre("Tom");
        System.out.println("El nombre nuevo del tercer gato es: " + miGato3.getNombre());
        miGato3.emiteSonido();
    }
    
}
