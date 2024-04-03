/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_2.herencia;

/**
 *
 * @author Soporte
 */
public class Poo_2Herencia {
    public int base;
    public int altura;

    /**
     * @param args the command line arguments
     */
    static class Triangulo extends Poo_2Herencia {
       double calculoDeArea() {
           double resultado = (float) (base*altura)/2;
           return resultado;
       }
    }
               
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo miTriangulo = new Triangulo();
        miTriangulo.base = 6;
        miTriangulo.altura = 3;
        System.out.println("El area del triangulo es: " + miTriangulo.calculoDeArea());
    }
}
