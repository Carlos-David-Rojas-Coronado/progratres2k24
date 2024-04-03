/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_her_poli;

import java.util.ArrayList;

/**
 *
 * @author Soporte
 */
public class Poo_her_poli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
            figuras.add(new Rectangulo(2,2, "Verde"));
            figuras.add(new Circunferencia(1, "Roja"));
            figuras.add(new TrianguloEquilatero(4, "Azul"));
            figuras.add(new Rectangulo(1,1, "Anaranjado"));
            for (FiguraGeometrica figura : figuras) {
                System.out.println(figura.perimetro());
            }
                    
    }
    
}
