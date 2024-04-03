/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_salarios;

/**
 *
 * @author Soporte
 */
public class EmpleadoSalarioFijo extends Empleado {
    private static final double PORC1=0.05;
    private static final double PORC2=0.1;
    private static final int MIN_ANIO = 2;
    private static final int MAX_ANIO = 5;
    private double sueldoBasico;
    public EmpleadoSalarioFijo(String dpi, String nombre, String apellido, int anioIngreso, double sueldoBasico)
    {
        super(dpi, nombre, apellido, anioIngreso);
        this.sueldoBasico=sueldoBasico;
    }
    private double calculoPorcentajeAdicional()
    {
        int antiguedad = antiguedadEnAnios();
        double porcentaje=0;
        if (antiguedad > MAX_ANIO){
            porcentaje = PORC2;
        } else if(antiguedad >= MIN_ANIO){
            porcentaje = PORC1;
        }
        return porcentaje;
    }
    @Override
    public double getSalario() {
        return sueldoBasico + (sueldoBasico * calculoPorcentajeAdicional());
    }
    
    
}
