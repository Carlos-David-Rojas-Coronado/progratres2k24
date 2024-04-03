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
public class TrianguloEquilatero extends FiguraGeometrica {
    private double lado;

    public TrianguloEquilatero(double lado, String color) {
        super(color);
        this.lado = lado;
    }
    @Override
    public double perimetro() {
        return 3*lado;
    }
    
}
