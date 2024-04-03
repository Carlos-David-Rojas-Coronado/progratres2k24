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
public abstract class FiguraGeometrica {
    private String color;
    public FiguraGeometrica(String color) {
        this.color=color;
    }
    public abstract double perimetro();
}
