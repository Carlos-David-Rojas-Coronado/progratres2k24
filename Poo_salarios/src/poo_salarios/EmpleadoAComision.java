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
public class EmpleadoAComision extends Empleado {
    private double salarioMinimo;
    private int cantidadClientesCaptados;
    private double montoPorClienteCaptado;
    
    public EmpleadoAComision(String dpi, String nombre, String apellido, int anioIngreso, double salarioMinimo, int cantidadClientesCaptados, double montoPorClienteCaptado) {
        super(dpi, nombre, apellido, anioIngreso);
        this.salarioMinimo=salarioMinimo;
        this.cantidadClientesCaptados=cantidadClientesCaptados;
        this.montoPorClienteCaptado=montoPorClienteCaptado;
    }
    public int getCantidadClientesCaptados()
    {
        return cantidadClientesCaptados;
    }
    public double getSueldoClientesCaptados()
    {
        return cantidadClientesCaptados*montoPorClienteCaptado;
    }

    @Override
    public double getSalario() {
        double salarioPorComision = montoPorClienteCaptado * cantidadClientesCaptados;
        if (salarioPorComision < this.salarioMinimo)
        {
            salarioPorComision = this.salarioMinimo;
        }
        return salarioPorComision;
    }
    
}
