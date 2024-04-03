/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_her_poli;

/**
 *
 * @author Soporte
 */
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.altura=altura;
        this.base=base;
    }
    @Override
    public double perimetro() {
        return 2*base+2*altura;
    }
}
