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
public class Circunferencia extends FiguraGeometrica {
    private double radio;
    public Circunferencia(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    @Override
    public double perimetro() {
       return 2*radio*Math.PI;
    }
}
